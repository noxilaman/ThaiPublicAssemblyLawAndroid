package com.kodmay.ThaiPublicAssemblyLaw.ui.forgotpassword;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\f\u0010\u000f\u001a\u00020\u0010*\u00020\fH\u0002\u00a8\u0006\u0011"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/forgotpassword/ForgotPasswordActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/HttpCallback;", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/UserResponse;", "()V", "forgotPassword", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFailure", "error", "", "onSuccess", "data", "isValidEmail", "", "app_debug"})
public final class ForgotPasswordActivity extends androidx.appcompat.app.AppCompatActivity implements com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.UserResponse> {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void forgotPassword() {
    }
    
    @java.lang.Override()
    public void onSuccess(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.model.UserResponse data) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    private final boolean isValidEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$isValidEmail) {
        return false;
    }
    
    public ForgotPasswordActivity() {
        super();
    }
}