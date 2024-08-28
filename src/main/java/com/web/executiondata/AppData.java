package com.web.executiondata;

import lombok.Getter;
import lombok.Setter;

public enum AppData {

    APP_URL("");

    @Getter
    @Setter
    private String url;
    AppData(String url){
        this.url=url;
    }
}
