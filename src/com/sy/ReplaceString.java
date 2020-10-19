package com.sy;

public class ReplaceString {
    public static String replaceSpace(String s) {

        StringBuffer buffer = new StringBuffer();

        String result = "";

        if (s.length() > 10000 || null == s) {
            return result;
        }

        char[] charArr = s.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            String temp = String.valueOf(charArr[i]);
            if (temp.equals(" ")) {
                buffer.append("%20");
            } else {
                buffer.append(charArr[i]);
            }
        }

        result = buffer.toString();
        return result;
    }
}
