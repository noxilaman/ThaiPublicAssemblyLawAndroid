package com.kodmay.ThaiPublicAssemblyLaw.repository;

import java.lang.System;

@androidx.room.Database(entities = {com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData.class, com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData.class, com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppData.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/repository/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "appDataDao", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/dao/AppDataDao;", "lawCatDao", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/dao/LawCatDao;", "lawDataDao", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/dao/LawDataDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    public static final com.kodmay.ThaiPublicAssemblyLaw.repository.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.kodmay.ThaiPublicAssemblyLaw.repository.dao.AppDataDao appDataDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.kodmay.ThaiPublicAssemblyLaw.repository.dao.LawDataDao lawDataDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.kodmay.ThaiPublicAssemblyLaw.repository.dao.LawCatDao lawCatDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/repository/AppDatabase$Companion;", "", "()V", "getAppDatabase", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/AppDatabase;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.kodmay.ThaiPublicAssemblyLaw.repository.AppDatabase getAppDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}