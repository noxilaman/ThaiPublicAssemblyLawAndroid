package com.kodmay.ThaiPublicAssemblyLaw.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kodmay.ThaiPublicAssemblyLaw.repository.dao.AppDataDao
import com.kodmay.ThaiPublicAssemblyLaw.repository.dao.LawCatDao
import com.kodmay.ThaiPublicAssemblyLaw.repository.dao.LawDataDao
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppData
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData

@Database(entities = arrayOf(LawData::class,CatData::class,AppData::class), version = 1)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        fun getAppDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, "db_app").build()
    }

    abstract fun appDataDao(): AppDataDao

    abstract fun lawDataDao(): LawDataDao

    abstract fun lawCatDao(): LawCatDao
}