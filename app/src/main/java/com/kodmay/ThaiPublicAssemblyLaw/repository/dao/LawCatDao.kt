package com.kodmay.ThaiPublicAssemblyLaw.repository.dao

import androidx.room.*
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData
import io.reactivex.Flowable

@Dao
interface LawCatDao {

    @Insert
    fun insertCatData(catData: CatData)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllCatData(catData: List<CatData>)

    @Update
    fun updateCatData(catData: CatData)

    @Delete
    fun deleteCatData(catData: CatData)

    @Query("SELECT * FROM law_cat order by i_seq asc")
    fun getCatData(): Flowable<List<CatData>>

    @Query("DELETE FROM law_cat")
    fun clearAllCatData()

}