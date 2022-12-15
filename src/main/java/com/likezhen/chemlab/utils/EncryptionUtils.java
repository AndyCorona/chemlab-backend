package com.likezhen.chemlab.utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptionUtils {

    public static String encodeStr(String rawStr, String algorithm) {
        String encodeStr = "";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.update(rawStr.getBytes(StandardCharsets.UTF_8));
            encodeStr = byte2Hex(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        return encodeStr;
    }

    /**
     * 将 byte 转为十六进制
     * @param bytes byte 数组
     * @return 十六进制字符串
     */
    public static String byte2Hex(byte[] bytes) {
        StringBuilder res = new StringBuilder();
        String temp;
        for (byte b : bytes) {
            temp = Integer.toHexString(b & 0xFF);
            if (temp.length() == 1) {
                res.append("0");
            }
            res.append(temp);
        }
        return res.toString();
    }
}
