package com.kodmay.ThaiPublicAssemblyLaw.repository.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\bH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/repository/dao/AppDataDao;", "", "clearAllAppData", "", "deleteAppData", "appData", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/AppData;", "getAppData", "Lio/reactivex/Flowable;", "", "getAppDataCount", "Lio/reactivex/Single;", "", "insertAppData", "updateAppData", "app_debug"})
public abstract interface AppDataDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAppData(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppData appData);
    
    @androidx.room.Update()
    public abstract void updateAppData(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppData appData);
    
    @androidx.room.Delete()
    public abstract void deleteAppData(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppData appData);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM app_data")
    public abstract io.reactivex.Flowable<java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppData>> getAppData();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT count(*) FROM app_data")
    public abstract io.reactivex.Single<java.lang.Integer> getAppDataCount();
    
    @androidx.room.Query(value = "DELETE FROM app_data")
    public abstract void clearAllAppData();
}