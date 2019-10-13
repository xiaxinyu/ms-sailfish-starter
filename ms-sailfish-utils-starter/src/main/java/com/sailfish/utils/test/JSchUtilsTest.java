package com.sailfish.utils.test;

import java.util.Map;

import com.sailfish.utils.JSchUtils;

public class JSchUtilsTest {
    public static void main(String[] args) throws Exception {
        Map<String, String> map = JSchUtils.genKeyPair("test");
        System.out.println("PRIVATE_KEY:");
        System.out.println(map.get(JSchUtils.PRIVATE_KEY));
        System.out.println();
        System.out.println("PUBLIC_KEY:");
        System.out.println(map.get(JSchUtils.PUBLIC_KEY));
    }
}
