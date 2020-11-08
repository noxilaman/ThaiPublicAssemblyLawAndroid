package com.kodmay.ThaiPublicAssemblyLaw.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 I2\u00020\u0001:\u0001IB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0017J&\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0017J.\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\"0\u0019H\u0017J\u001e\u0010#\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0017J\u001e\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u001d2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020&0\u0019H\u0017J\u001e\u0010\'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u001d2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020)0\u0019H\u0017J\u0016\u0010*\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020+0\u0019H\u0017J\u0016\u0010,\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020-0\u0019H\u0017J\u001e\u0010.\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020/0\u0019H\u0017J\u001c\u00100\u001a\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000202010\u0019H\u0017J\u001e\u00103\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002020\u0019H\u0017J&\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u0019H\u0017J\u001a\u00108\u001a\u00020\u00152\u0006\u00109\u001a\u00020:2\b\u0010\u0018\u001a\u0004\u0018\u00010;H\u0002J\u001e\u0010<\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020=0\u0019H\u0017J\u0018\u0010>\u001a\u00020\u00152\u0006\u00109\u001a\u00020:2\u0006\u0010\u0018\u001a\u00020;H\u0017J\u001e\u0010?\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u0019H\u0017J\u001e\u0010@\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020A0\u0019H\u0017J&\u0010B\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u0019H\u0017J&\u0010C\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020A0\u0019H\u0017J.\u0010E\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020&0\u0019H\u0017J.\u0010H\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020&0\u0019H\u0017R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006J"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/repository/LawRepository;", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/LawDataSource;", "()V", "api", "Lcom/kodmay/ThaiPublicAssemblyLaw/api/ApiEndpoint;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kodmay/ThaiPublicAssemblyLaw/api/ApiEndpoint;", "api$delegate", "Lkotlin/Lazy;", "appDatabase", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/AppDatabase;", "getAppDatabase", "()Lcom/kodmay/ThaiPublicAssemblyLaw/repository/AppDatabase;", "appDatabase$delegate", "lawPref", "Lcom/avalue/phsc/data/preferences/LawPrefs;", "getLawPref", "()Lcom/avalue/phsc/data/preferences/LawPrefs;", "lawPref$delegate", "addBookmark", "", "lawId", "", "callback", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/HttpCallback;", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/AddBookmarkResponse;", "addBookmarkNote", "note", "", "changePassword", "userId", "oldPassword", "newPassword", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/ChangePasswordResponse;", "deleteBookmark", "forgotPassword", "email", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/UserResponse;", "loadAppData", "packageName", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/AppDataResponse;", "loadAppStoreList", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/AppListResponse;", "loadBookmark", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/BookmarkResponse;", "loadBookmarkNote", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/BookmarkNoteResponse;", "loadCacheLaw", "", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/LawData;", "loadCacheLawDetail", "loadCatLawItem", "catId", "appID", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/LawByCatResponse;", "loadData", "context", "Landroid/content/Context;", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/HttpVoidCallback;", "loadDekaByLawId", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/DekaLawResponse;", "loadInitial", "loadLawByCat", "loadLawData", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/LawDataResponse;", "loadLawDataByCat", "loadLawDetail", "lawID", "login", "password", "appId", "register", "Companion", "app_debug"})
public final class LawRepository implements com.kodmay.ThaiPublicAssemblyLaw.repository.LawDataSource {
    private final kotlin.Lazy api$delegate = null;
    private final kotlin.Lazy lawPref$delegate = null;
    private final kotlin.Lazy appDatabase$delegate = null;
    private static com.kodmay.ThaiPublicAssemblyLaw.repository.LawRepository INSTANCE;
    public static final com.kodmay.ThaiPublicAssemblyLaw.repository.LawRepository.Companion Companion = null;
    
    private final com.kodmay.ThaiPublicAssemblyLaw.api.ApiEndpoint getApi() {
        return null;
    }
    
    private final com.avalue.phsc.data.preferences.LawPrefs getLawPref() {
        return null;
    }
    
    private final com.kodmay.ThaiPublicAssemblyLaw.repository.AppDatabase getAppDatabase() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void register(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, int appId, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.UserResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, int appId, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.UserResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void changePassword(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String oldPassword, @org.jetbrains.annotations.NotNull()
    java.lang.String newPassword, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.ChangePasswordResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void forgotPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.UserResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void loadAppData(@org.jetbrains.annotations.NotNull()
    java.lang.String packageName, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppDataResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void loadLawData(int appID, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawDataResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void loadLawByCat(int appID, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawByCatResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void loadCatLawItem(int catId, int appID, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawByCatResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void loadLawDataByCat(int catId, int appID, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawByCatResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void loadLawDetail(int lawID, int appID, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawDataResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void loadDekaByLawId(int lawId, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.DekaLawResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void loadAppStoreList(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppListResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void addBookmark(int lawId, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AddBookmarkResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void addBookmarkNote(int lawId, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AddBookmarkResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void loadBookmark(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.BookmarkResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void loadBookmarkNote(int lawId, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.BookmarkNoteResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void deleteBookmark(int lawId, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AddBookmarkResponse> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void loadInitial(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpVoidCallback callback) {
    }
    
    private final void loadData(android.content.Context context, com.kodmay.ThaiPublicAssemblyLaw.repository.HttpVoidCallback callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void loadCacheLawDetail(int lawId, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData> callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void loadCacheLaw(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData>> callback) {
    }
    
    public LawRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.kodmay.ThaiPublicAssemblyLaw.repository.LawRepository getInstance() {
        return null;
    }
    
    public static final void destroyInstance() {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/repository/LawRepository$Companion;", "", "()V", "INSTANCE", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/LawRepository;", "destroyInstance", "", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.kodmay.ThaiPublicAssemblyLaw.repository.LawRepository getInstance() {
            return null;
        }
        
        public final void destroyInstance() {
        }
        
        private Companion() {
            super();
        }
    }
}