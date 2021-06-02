package com.uu.json.simple;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import java.util.ArrayList;
import java.util.List;

public class JsonArray2List {

    public static void main(String[] args) {
        // List转型JSONArray
        List<Student> list = new ArrayList<>();
        list.add(new Student("DSH",15));
        list.add(new Student("dsdf", 12));
        JSONArray jsonArray = JSONArray.fromObject(list);
        System.out.println(jsonArray);

        // JSONArray转型List
        List<Student> jsonList = JSONArray.toList(jsonArray, new Student(), new JsonConfig());
        jsonList.stream().forEach(student -> {
            System.out.println(student);
        });
    }
}
