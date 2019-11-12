package com.willlockwood.takehometemplate

import androidx.recyclerview.widget.DiffUtil
import com.willlockwood.takehometemplate.data.model.Lockwood

class LockwoodDiffCallback(private val oldList: List<Lockwood>, private val newList: List<Lockwood>) : DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] === newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldPost = oldList[oldItemPosition]
        val newPost = newList[newItemPosition]

        return oldPost.user == newPost.user
    }

    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
        return super.getChangePayload(oldItemPosition, newItemPosition)
    }
}
