package com.web.executiondata;

import com.web.enums.Browser;

public class GlobalData {

    public static String BS_USERNAME = System.getProperty("bs_user","");

    public static String BS_KEY = System.getProperty("bs_key","");

    public static boolean IS_REMOTE= Boolean.parseBoolean(System.getProperty("is_remote","false"));

    public static String EXECUTION_BROWSER = System.getProperty("browser", Browser.CHROME.name());

}
