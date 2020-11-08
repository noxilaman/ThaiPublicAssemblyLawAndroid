package com.kodmay.ThaiPublicAssemblyLaw.repository.dao

import androidx.room.*
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppData
import io.reactivex.Flowable
import io.reactivex.Single

@Dao
interface AppDataDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAppData(appData: AppData)

    @Update
    fun updateAppData(appData: AppData)

    @Delete
    fun deleteAppData(appData: AppData)

    @Query("SELECT * FROM app_data")
    fun getAppData(): Flowable<List<AppData>>

    @Query("SELECT count(*) FROM app_data")
    fun getAppDataCount(): Single<Int>

    @Query("DELETE FROM app_data")
    fun clearAllAppData()

}