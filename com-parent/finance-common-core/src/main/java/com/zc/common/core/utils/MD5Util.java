package com.zc.common.core.utils;

import java.security.MessageDigest;

public class MD5Util {
    private static final String[] HEX_DIGITS = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    public MD5Util() {
    }

    private static String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();

        for(int i = 0; i < b.length; ++i) {
            resultSb.append(byteToHexString(b[i]));
        }

        return resultSb.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b;
        if(b < 0) {
            n = b + 256;
        }

        int d1 = n / 16;
        int d2 = n % 16;
        return HEX_DIGITS[d1] + HEX_DIGITS[d2];
    }

    public static String mD5Encode(String origin, String charsetName) {
        String resultString = null;

        try {
            resultString = new String(origin);
            MessageDigest md = MessageDigest.getInstance("MD5");
            if(charsetName != null && !"".equals(charsetName)) {
                resultString = byteArrayToHexString(md.digest(resultString.getBytes(charsetName)));
            } else {
                resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
            }
        } catch (Exception var4) {
            ;
        }

        return resultString;
    }
}