package com.example.demo.utils;

import java.util.UUID;

/**
 * @author ruanjiayu
 * @dateTime 2019/6/6 16:32
 */
public class UUID32Utils {

    public static String getUUID32(){
        String uuid = UUID.randomUUID().toString();
        return uuid.replace("-","");
    }
}
