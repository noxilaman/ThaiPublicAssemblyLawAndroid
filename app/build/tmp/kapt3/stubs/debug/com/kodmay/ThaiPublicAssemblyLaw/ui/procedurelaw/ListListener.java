package com.kodmay.ThaiPublicAssemblyLaw.ui.procedurelaw;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/procedurelaw/ListListener;", "", "onCatSelect", "", "catData", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/CatData;", "onLawSelect", "lawId", "", "app_debug"})
public abstract interface ListListener {
    
    public abstract void onCatSelect(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData catData);
    
    public abstract void onLawSelect(int lawId);
}