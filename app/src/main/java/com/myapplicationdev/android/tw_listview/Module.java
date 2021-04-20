package com.myapplicationdev.android.tw_listview;

public class Module {
    private String code;
    private int resourceImageCode;

    public Module(String code, int resourceImageCode) {
        this.code = code;
        this.resourceImageCode = resourceImageCode;
    }

    public String getCode() {
        return code;
    }

    public int getResourceImageCode() {
        return resourceImageCode;
    }
}
