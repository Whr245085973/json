package com.uu.json.simple;

import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map2JsonString {

    public static void main(String[] args) {
        // 将map对象转成json字符串
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("1", new Student("SHS", 14));
        studentMap.put("2", new Student("sfs", 21));
        JSONObject jsonObject = JSONObject.fromObject(studentMap);
        System.out.println(jsonObject);

        // 将json字符串转成map对象
        String jsonMap = "{\"1\":{\"age\":14,\"name\":\"SHS\"},\"2\":{\"age\":21,\"name\":\"sfs\"}}";
        Map map = JSONObject.fromObject(jsonMap);
        map.keySet().stream().forEach(s->{
            JSONObject jsonObject1 = JSONObject.fromObject(map.get(s));
            Student student = (Student)JSONObject.toBean(jsonObject1, Student.class);
            System.out.println(student);
        });
    }
}
