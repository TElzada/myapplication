package com.geeks.myapplication.utils

import android.content.Context

object Prefs {
    private const val PREFS_NAME = "app_prefs"
    private const val KEY_ONBOARD_SHOWN = "onboard_shown"

    fun setOnBoardShown(context: Context, shown: Boolean) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        prefs.edit().putBoolean(KEY_ONBOARD_SHOWN, shown).apply()
    }

    fun isOnBoardShown(context: Context): Boolean {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        return prefs.getBoolean(KEY_ONBOARD_SHOWN, false)
    }
}
