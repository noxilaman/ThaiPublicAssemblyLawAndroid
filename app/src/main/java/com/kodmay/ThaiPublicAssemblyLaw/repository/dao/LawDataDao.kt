package com.kodmay.ThaiPublicAssemblyLaw.repository.dao

import androidx.room.*
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData
import io.reactivex.Flowable

@Dao
interface LawDataDao {

    @Insert
    fun insertLawData(lawData: LawData)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllLawData(lawData: List<LawData>)

    @Update
    fun updateLawData(lawData: LawData)

    @Delete
    fun deleteLawData(lawData: LawData)

    @Query("select * FROM law_data order by i_no asc")
    fun getLawData(): Flowable<List<LawData>>

    @Query("select * FROM law_data where i_id = :id")
    fun getLawDataById(id: Int): Flowable<LawData>

    @Query("DELETE FROM law_data")
    fun clearAllLawData()

}