package com.kodmay.ThaiPublicAssemblyLaw;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/App;", "Landroid/app/Application;", "()V", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "skulList", "", "Lcom/android/billingclient/api/SkuDetails;", "getSkulList", "()Ljava/util/List;", "setSkulList", "(Ljava/util/List;)V", "connectBilling", "", "onCreate", "querySkull", "app_debug"})
public final class App extends android.app.Application {
    private com.android.billingclient.api.BillingClient billingClient;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.android.billingclient.api.SkuDetails> skulList;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.android.billingclient.api.SkuDetails> getSkulList() {
        return null;
    }
    
    public final void setSkulList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.billingclient.api.SkuDetails> p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void connectBilling() {
    }
    
    private final void querySkull() {
    }
    
    public App() {
        super();
    }
}