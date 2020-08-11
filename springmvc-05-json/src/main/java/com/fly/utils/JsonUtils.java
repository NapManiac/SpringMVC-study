package com.fly.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonUtils {

    public static String getJson(Object object) {
        return getJson(object, "yyyy-MM-dd hh:mm:ss");
    }

    public static String getJson(Object object, String sdfString) {
        ObjectMapper mapper = new ObjectMapper();
        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS, false);
        //自定义日期格式对象
        SimpleDateFormat sdf = new SimpleDateFormat(sdfString);
        //指定日期格式
        mapper.setDateFormat(sdf);
        //将我们的对象解析成为json格式
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
