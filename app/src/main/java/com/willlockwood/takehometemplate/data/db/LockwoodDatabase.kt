package com.willlockwood.takehometemplate.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import com.willlockwood.takehometemplate.data.converter.LockwoodConverters
import com.willlockwood.takehometemplate.data.dao.LockwoodDao
import com.willlockwood.takehometemplate.data.model.Lockwood
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database (
    entities = [Lockwood::class],
    version = 8
)
@TypeConverters(value= [LockwoodConverters::class])
abstract class LockwoodDatabase : RoomDatabase() {

    abstract fun lockwoodDao(): LockwoodDao

    companion object {
        @Volatile
        private var INSTANCE: LockwoodDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): LockwoodDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    LockwoodDatabase::class.java,
                    "lockwood_database")
                    .addCallback(LockwoodDatabaseCallback(scope))
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }

        private class LockwoodDatabaseCallback(private val scope: CoroutineScope) : RoomDatabase.Callback() {
            override fun onOpen(db: SupportSQLiteDatabase) {
                super.onOpen(db)
                INSTANCE?.let { database ->
                    populateDatabase(scope, database.lockwoodDao())
                }
            }
        }

        fun populateDatabase(scope: CoroutineScope, lockwoodDao: LockwoodDao) {
//            val lockwoods = listOf(
//                Lockwood("will"),
//                Lockwood("rey"),
//                Lockwood("alex")
//            )
            scope.launch {
                lockwoodDao.deleteAll()
//                lockwoodDao.insert(lockwoods)
            }
        }
    }
}