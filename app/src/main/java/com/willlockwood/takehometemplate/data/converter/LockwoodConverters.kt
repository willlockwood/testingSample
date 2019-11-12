package com.willlockwood.takehometemplate.data.converter

import androidx.room.TypeConverter
import com.willlockwood.takehometemplate.data.model.Lockwood

object LockwoodConverters {

    @TypeConverter
    @JvmStatic
    fun toString(value: String): String? { return value }

    @TypeConverter
    @JvmStatic
    fun fromString(value: Lockwood): String? { return value.user }
}