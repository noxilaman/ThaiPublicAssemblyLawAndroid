package com.kodmay.ThaiPublicAssemblyLaw.ui.purchase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0012H\u0014J\b\u0010\u001a\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/purchase/PurchaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "lawPref", "Lcom/avalue/phsc/data/preferences/LawPrefs;", "getLawPref", "()Lcom/avalue/phsc/data/preferences/LawPrefs;", "lawPref$delegate", "Lkotlin/Lazy;", "skul", "Lcom/android/billingclient/api/SkuDetails;", "getSkul", "()Lcom/android/billingclient/api/SkuDetails;", "setSkul", "(Lcom/android/billingclient/api/SkuDetails;)V", "bindData", "", "buyItem", "checkPurchaseList", "connectBilling", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "querySkull", "app_debug"})
public final class PurchaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy lawPref$delegate = null;
    private com.android.billingclient.api.BillingClient billingClient;
    @org.jetbrains.annotations.Nullable()
    private com.android.billingclient.api.SkuDetails skul;
    private java.util.HashMap _$_findViewCache;
    
    private final com.avalue.phsc.data.preferences.LawPrefs getLawPref() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.billingclient.api.SkuDetails getSkul() {
        return null;
    }
    
    public final void setSkul(@org.jetbrains.annotations.Nullable()
    com.android.billingclient.api.SkuDetails p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bindData() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void connectBilling() {
    }
    
    private final void querySkull() {
    }
    
    private final void checkPurchaseList() {
    }
    
    private final void buyItem() {
    }
    
    public PurchaseActivity() {
        super();
    }
}