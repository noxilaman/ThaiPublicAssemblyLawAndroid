package com.kodmay.ThaiPublicAssemblyLaw.repository.model;

import java.lang.System;

@androidx.room.Entity(tableName = "law_data")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\u007f\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001J\t\u0010-\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013\u00a8\u0006."}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/LawData;", "", "i_id", "", "c_comment", "", "app_id", "c_desc", "c_name", "c_url", "i_lawcat", "i_lawno", "i_no", "i_subno", "note", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;)V", "getApp_id", "()I", "getC_comment", "()Ljava/lang/String;", "getC_desc", "getC_name", "getC_url", "getI_id", "getI_lawcat", "getI_lawno", "getI_no", "getI_subno", "getNote", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class LawData {
    @androidx.room.PrimaryKey()
    private final int i_id = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String c_comment = null;
    private final int app_id = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String c_desc = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String c_name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String c_url = null;
    private final int i_lawcat = 0;
    private final int i_lawno = 0;
    private final int i_no = 0;
    private final int i_subno = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String note = null;
    
    public final int getI_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getC_comment() {
        return null;
    }
    
    public final int getApp_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getC_desc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getC_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getC_url() {
        return null;
    }
    
    public final int getI_lawcat() {
        return 0;
    }
    
    public final int getI_lawno() {
        return 0;
    }
    
    public final int getI_no() {
        return 0;
    }
    
    public final int getI_subno() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNote() {
        return null;
    }
    
    public LawData(int i_id, @org.jetbrains.annotations.Nullable()
    java.lang.String c_comment, int app_id, @org.jetbrains.annotations.Nullable()
    java.lang.String c_desc, @org.jetbrains.annotations.NotNull()
    java.lang.String c_name, @org.jetbrains.annotations.Nullable()
    java.lang.String c_url, int i_lawcat, int i_lawno, int i_no, int i_subno, @org.jetbrains.annotations.Nullable()
    java.lang.String note) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData copy(int i_id, @org.jetbrains.annotations.Nullable()
    java.lang.String c_comment, int app_id, @org.jetbrains.annotations.Nullable()
    java.lang.String c_desc, @org.jetbrains.annotations.NotNull()
    java.lang.String c_name, @org.jetbrains.annotations.Nullable()
    java.lang.String c_url, int i_lawcat, int i_lawno, int i_no, int i_subno, @org.jetbrains.annotations.Nullable()
    java.lang.String note) {
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
}