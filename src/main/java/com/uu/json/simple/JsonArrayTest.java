package com.uu.json.simple;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonArrayTest {

    public static void main(String[] args) {
        // 创建JsonArray对象
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(0, "whr");
        jsonArray.add(1, "dhj");
        System.out.println(jsonArray);

        // 新增属性
        jsonArray.element(2, "jks");
        System.out.println(jsonArray);

        // 根据key查找下标数据
        System.out.println(jsonArray.get(2));

        // 根据下标更新数据
        jsonArray.set(0, "ssv");
        System.out.println(jsonArray);

        // 将jsonObject加入jsonArray中
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "dddhsk");
        jsonObject.put("age", 18);
        jsonArray.add(jsonObject);
        System.out.println(jsonArray);

        // 遍历
        for (int i = 0; i<jsonArray.size(); i++){
            System.out.println(jsonArray.get(i) + "\t");
        }


    }

}
