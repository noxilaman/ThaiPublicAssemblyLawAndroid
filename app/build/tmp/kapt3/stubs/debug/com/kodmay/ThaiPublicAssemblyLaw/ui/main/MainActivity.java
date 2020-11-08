package com.kodmay.ThaiPublicAssemblyLaw.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0015H\u0016J\u0012\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0017H\u0014J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020\u0015H\u0016J\b\u0010(\u001a\u00020\u0017H\u0016J\b\u0010)\u001a\u00020\u001dH\u0016J\u0018\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u001dH\u0016J\b\u0010-\u001a\u00020\u0017H\u0016J\b\u0010.\u001a\u00020\u0017H\u0002J\u0010\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u001dH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/main/FragmentInteractionListener;", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/HttpVoidCallback;", "()V", "lawPref", "Lcom/avalue/phsc/data/preferences/LawPrefs;", "getLawPref", "()Lcom/avalue/phsc/data/preferences/LawPrefs;", "lawPref$delegate", "Lkotlin/Lazy;", "pageListener", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/main/MainActivity$PagerFragmentListener;", "getPageListener", "()Lcom/kodmay/ThaiPublicAssemblyLaw/ui/main/MainActivity$PagerFragmentListener;", "setPageListener", "(Lcom/kodmay/ThaiPublicAssemblyLaw/ui/main/MainActivity$PagerFragmentListener;)V", "sectionsPagerAdapter", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/main/SectionsPagerAdapter;", "titleStack", "", "", "onBack", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onFailure", "error", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "onShowSnackBar", "message", "onSuccess", "onSupportNavigateUp", "onTitleChange", "title", "addToStack", "popupTitleBackStack", "setupTabIcons", "showBackButton", "showing", "PagerFragmentListener", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.kodmay.ThaiPublicAssemblyLaw.ui.main.FragmentInteractionListener, com.kodmay.ThaiPublicAssemblyLaw.repository.HttpVoidCallback {
    @org.jetbrains.annotations.Nullable()
    private com.kodmay.ThaiPublicAssemblyLaw.ui.main.MainActivity.PagerFragmentListener pageListener;
    private final kotlin.Lazy lawPref$delegate = null;
    private final com.kodmay.ThaiPublicAssemblyLaw.ui.main.SectionsPagerAdapter sectionsPagerAdapter = null;
    private java.util.List<java.lang.String> titleStack;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.kodmay.ThaiPublicAssemblyLaw.ui.main.MainActivity.PagerFragmentListener getPageListener() {
        return null;
    }
    
    public final void setPageListener(@org.jetbrains.annotations.Nullable()
    com.kodmay.ThaiPublicAssemblyLaw.ui.main.MainActivity.PagerFragmentListener p0) {
    }
    
    private final com.avalue.phsc.data.preferences.LawPrefs getLawPref() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    private final void setupTabIcons() {
    }
    
    @java.lang.Override()
    public void onSuccess() {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void onTitleChange(@org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean addToStack) {
    }
    
    @java.lang.Override()
    public void popupTitleBackStack() {
    }
    
    @java.lang.Override()
    public void onShowSnackBar(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void showBackButton(boolean showing) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onBack() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/main/MainActivity$PagerFragmentListener;", "", "onBackPressed", "", "app_debug"})
    public static abstract interface PagerFragmentListener {
        
        public abstract void onBackPressed();
    }
}