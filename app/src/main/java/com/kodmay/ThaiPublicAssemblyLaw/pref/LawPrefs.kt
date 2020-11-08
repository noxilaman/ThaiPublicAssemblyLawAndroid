package com.avalue.phsc.data.preferences

import android.content.Context
import com.kodmay.ThaiPublicAssemblyLaw.common.Prefs

class LawPrefs(val context: Context) : Prefs(context) {
    //private val MENU_DATA = "menu_data"
    private val APP_ID = "app_id"
    private val USER_ID = "user_id"
    private val PREMIUM = "premium"

    //private val gson: Gson by lazy { Gsoner.getInstance().gson }

    /*var menuData: MenuData
        get() = gson.fromJson(prefs.getString(MENU_DATA, null),MenuData::class.java)
        set(value) = prefs.edit().putString(MENU_DATA, gson.toJson(value)).apply()*/

    var appId: Int
        get() = prefs.getInt(APP_ID, 0)
        set(value) = prefs.edit().putInt(APP_ID, value).apply()

    var userId: Int
        get() = prefs.getInt(USER_ID, 0)
        set(value) = prefs.edit().putInt(USER_ID, value).apply()

    var premium: Boolean
        get() = prefs.getBoolean(PREMIUM, false)
        set(value) = prefs.edit().putBoolean(PREMIUM, value).apply()

}