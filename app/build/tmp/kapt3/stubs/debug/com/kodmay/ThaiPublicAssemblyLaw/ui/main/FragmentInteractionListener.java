package com.kodmay.ThaiPublicAssemblyLaw.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nH&\u00a8\u0006\u000e"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/main/FragmentInteractionListener;", "", "onBack", "", "onShowSnackBar", "message", "", "onTitleChange", "title", "addStack", "", "popupTitleBackStack", "showBackButton", "showing", "app_debug"})
public abstract interface FragmentInteractionListener {
    
    public abstract void onTitleChange(@org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean addStack);
    
    public abstract void popupTitleBackStack();
    
    public abstract void onShowSnackBar(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void showBackButton(boolean showing);
    
    public abstract void onBack();
}