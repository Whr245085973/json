package com.uu.json.simple;

import net.sf.json.JSONArray;

public class JsonArray2Shuzu {

    public static void main(String[] args) {
        // 数组转型JSONArray
        boolean[] booleans = {true, false, false};
        JSONArray jsonArray = JSONArray.fromObject(booleans);
        System.out.println(jsonArray);

        // 将JSONArray转型数组
        Object[] objects = jsonArray.toArray();
        for (Object o : objects){
            System.out.print(o + " ");
        }
    }
}
