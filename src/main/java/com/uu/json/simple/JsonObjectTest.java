package com.uu.json.simple;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonObjectTest {

    public static void main(String[] args) {
        // 创建jsonObject对象
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "wuhognren");
        jsonObject.put("age", 15);
        System.out.println(jsonObject);

        // 添加属性
        jsonObject.element("sex", "男");
        System.out.println(jsonObject);

        // 根据key返回
        System.out.println(jsonObject.get("sex"));

        // 判断输出对象的类型
        boolean array = jsonObject.isArray();
        boolean empty = jsonObject.isEmpty();
        boolean nullObject = jsonObject.isNullObject();
        System.out.println("是否为数组：" + array + ",是否为空：" + empty + ",是否为空对象：" + nullObject);

        // 将JsonArray对象加到JsonObject中
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(0, "123");
        jsonArray.add(1, "234");
        jsonObject.element("arrayList", jsonArray);
        System.out.println(jsonObject);
    }

}
