package com.kodmay.ThaiPublicAssemblyLaw.repository.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\bH\'J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\r"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/repository/dao/LawCatDao;", "", "clearAllCatData", "", "deleteCatData", "catData", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/CatData;", "getCatData", "Lio/reactivex/Flowable;", "", "insertAllCatData", "insertCatData", "updateCatData", "app_debug"})
public abstract interface LawCatDao {
    
    @androidx.room.Insert()
    public abstract void insertCatData(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData catData);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAllCatData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData> catData);
    
    @androidx.room.Update()
    public abstract void updateCatData(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData catData);
    
    @androidx.room.Delete()
    public abstract void deleteCatData(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData catData);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM law_cat order by i_seq asc")
    public abstract io.reactivex.Flowable<java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData>> getCatData();
    
    @androidx.room.Query(value = "DELETE FROM law_cat")
    public abstract void clearAllCatData();
}