package com.kodmay.ThaiPublicAssemblyLaw.repository.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\bH\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/repository/dao/LawDataDao;", "", "clearAllLawData", "", "deleteLawData", "lawData", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/LawData;", "getLawData", "Lio/reactivex/Flowable;", "", "getLawDataById", "id", "", "insertAllLawData", "insertLawData", "updateLawData", "app_debug"})
public abstract interface LawDataDao {
    
    @androidx.room.Insert()
    public abstract void insertLawData(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData lawData);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAllLawData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData> lawData);
    
    @androidx.room.Update()
    public abstract void updateLawData(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData lawData);
    
    @androidx.room.Delete()
    public abstract void deleteLawData(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData lawData);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * FROM law_data order by i_no asc")
    public abstract io.reactivex.Flowable<java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData>> getLawData();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * FROM law_data where i_id = :id")
    public abstract io.reactivex.Flowable<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData> getLawDataById(int id);
    
    @androidx.room.Query(value = "DELETE FROM law_data")
    public abstract void clearAllLawData();
}