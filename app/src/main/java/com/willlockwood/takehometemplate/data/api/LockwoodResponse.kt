package com.willlockwood.takehometemplate.data.api

import com.google.gson.GsonBuilder
import com.willlockwood.takehometemplate.data.model.Lockwood

class LockwoodResponse {

    var hits: List<Lockwood> = ArrayList()
//    val innerResponse = parseJSON()

    companion object {
        fun parseJSON(response: String): LockwoodResponse {
            val gson = GsonBuilder().create()
            return gson.fromJson(response, LockwoodResponse::class.java)
        }
    }
}