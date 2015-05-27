package com.ntian.greendaodb;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table APK_ENTITY.
 */
public class ApkEntity {

    private Long id;
    private String packageName;
    private byte[] apkInfo;

    public ApkEntity() {
    }

    public ApkEntity(Long id) {
        this.id = id;
    }

    public ApkEntity(Long id, String packageName, byte[] apkInfo) {
        this.id = id;
        this.packageName = packageName;
        this.apkInfo = apkInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public byte[] getApkInfo() {
        return apkInfo;
    }

    public void setApkInfo(byte[] apkInfo) {
        this.apkInfo = apkInfo;
    }

}