package com.uu.json.simple;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class List2JsonString {

    public static void main(String[] args) {
        // 将list对象转成json字符串
        List<Student> list = new ArrayList<>();
        list.add(new Student("DSH",15));
        list.add(new Student("dsdf", 12));
        JSONArray jsonArray = JSONArray.fromObject(list);
        System.out.println(jsonArray);

        // json字符串转成list对象
        List<Student> students = new ArrayList<>();
        String jsonList = "[{\"age\":15,\"name\":\"DSH\"},{\"age\":12,\"name\":\"dsdf\"}]";
        JSONArray jsonArray1 = JSONArray.fromObject(jsonList);
        for (int i = 0; i < jsonArray1.size(); i++) {
            JSONObject jsonObject = jsonArray1.getJSONObject(i);
            Student student = (Student)JSONObject.toBean(jsonObject, Student.class);
            students.add(student);
        }
        System.out.println(students);
    }

}
