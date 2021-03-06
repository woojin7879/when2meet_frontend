package com.example.when2meet;

import java.lang.reflect.Field;

public class SelectManager {
    public static String LOGGER = "LOGGER!";
    public final static int RC_DETAIL_TO_UPDATE = 1000;
    public final static int RC_CA_TO_DETAIL = 1001;
    public final static int RC_CA_TO_UPDATE = 1002;
    public final static int RQ_PIC_TO_DETAIL = 1003;


    public static int getDrawableResId(String resName) {
        try {
            Field idField = R.drawable.class.getDeclaredField(resName);
            return idField.getInt(idField);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
