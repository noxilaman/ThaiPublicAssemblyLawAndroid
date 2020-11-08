package com.kodmay.ThaiPublicAssemblyLaw.repository.model;

import java.lang.System;

@androidx.room.Entity(tableName = "law_cat")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004BE\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0006H\u00c6\u0001J\b\u0010#\u001a\u00020\u0006H\u0016J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u00d6\u0003J\t\u0010(\u001a\u00020\u0006H\u00d6\u0001J\t\u0010)\u001a\u00020\tH\u00d6\u0001J\u0018\u0010*\u001a\u00020+2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0006H\u0016R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011\u00a8\u0006."}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/CatData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "i_id", "", "app_id", "c_desc", "", "c_law_code", "c_name", "i_level", "i_parent_id", "i_seq", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V", "getApp_id", "()I", "getC_desc", "()Ljava/lang/String;", "getC_law_code", "getC_name", "getI_id", "getI_level", "getI_parent_id", "getI_seq", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public final class CatData implements android.os.Parcelable {
    @androidx.room.PrimaryKey()
    private final int i_id = 0;
    private final int app_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String c_desc = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String c_law_code = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String c_name = null;
    private final int i_level = 0;
    private final int i_parent_id = 0;
    private final int i_seq = 0;
    public static final com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData.CREATOR CREATOR = null;
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    public final int getI_id() {
        return 0;
    }
    
    public final int getApp_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getC_desc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getC_law_code() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getC_name() {
        return null;
    }
    
    public final int getI_level() {
        return 0;
    }
    
    public final int getI_parent_id() {
        return 0;
    }
    
    public final int getI_seq() {
        return 0;
    }
    
    public CatData(int i_id, int app_id, @org.jetbrains.annotations.NotNull()
    java.lang.String c_desc, @org.jetbrains.annotations.NotNull()
    java.lang.String c_law_code, @org.jetbrains.annotations.NotNull()
    java.lang.String c_name, int i_level, int i_parent_id, int i_seq) {
        super();
    }
    
    public CatData(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData copy(int i_id, int app_id, @org.jetbrains.annotations.NotNull()
    java.lang.String c_desc, @org.jetbrains.annotations.NotNull()
    java.lang.String c_law_code, @org.jetbrains.annotations.NotNull()
    java.lang.String c_name, int i_level, int i_parent_id, int i_seq) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/CatData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/CatData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/CatData;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}