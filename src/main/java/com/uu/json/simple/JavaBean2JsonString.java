package com.uu.json.simple;

import net.sf.json.JSONObject;

public class JavaBean2JsonString {

    public static void main(String[] args) {
        // JavaBean对象转JsonObject字符串
        Student whr = new Student("whr", 14);
        // 这个方法是将对象转为json对象（不论是将json字符串还是java对象都是这个方法）
        JSONObject jsonObject = JSONObject.fromObject(whr);
        System.out.println(jsonObject);

        // JsonObject字符串转JavaBean对象
        String jsonStr = "{\"age\":14,\"name\":\"whr\"}";
        JSONObject jsonObject1 = JSONObject.fromObject(jsonStr);
        Student student = (Student) JSONObject.toBean(jsonObject1, Student.class);
        System.out.println(student);

    }

}
