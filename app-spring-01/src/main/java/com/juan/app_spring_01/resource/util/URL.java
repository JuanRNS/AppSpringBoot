package com.juan.app_spring_01.resource.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class URL {
    public static String encode(String url) {
        return URLDecoder.decode(url, StandardCharsets.UTF_8);
    }

    public static Date convert(String textDate, Date defaultDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(textDate);
        }
        catch (ParseException e){
            return defaultDate;
        }

    }
}
