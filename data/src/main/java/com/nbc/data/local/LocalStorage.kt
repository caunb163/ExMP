package com.nbc.data.local

import android.content.SharedPreferences
import com.google.gson.Gson

class LocalStorage(
    private val sharedPreferences: SharedPreferences
) {
    private val gson = Gson()

    companion object {
        const val FIRST_OPEN = "first_open"
    }

    fun <T> putObject(key: String, value: T) {
        sharedPreferences.edit().putString(key, gson.toJson(value)).apply()
    }

    fun <T> getObject(key: String, tClass: T): T? {
        return sharedPreferences.getString(key, "")?.let {
            gson.fromJson(it, tClass!!::class.java)
        }
    }

    fun getSharePreference(): SharedPreferences {
        return sharedPreferences
    }

}