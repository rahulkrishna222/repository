package com.grandmaster.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;

public class GrandmasterUtil {

    public static String getMD5Hash(String source) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        MessageDigest digest = MessageDigest.getInstance("MD5");

        digest.reset(); // clearing MessageDigest before generating hash.

        byte[] passwordBytes = digest.digest(source.getBytes("UTF-8"));

        StringBuffer sbf = new StringBuffer();
        // Generating MD5 password hash
        for (int i = 0; i < passwordBytes.length; i++) {
            // appending hash bits to buffer
            sbf.append(Integer.toString((passwordBytes[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sbf.toString();
    }

    public static String convertTimestampToString(Timestamp source) {
        return null;
    }

    public static Timestamp convertStringToTimestamp(String source) {
        return null;
    }

}
