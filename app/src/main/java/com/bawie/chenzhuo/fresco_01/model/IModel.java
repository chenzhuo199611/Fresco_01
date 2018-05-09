package com.bawie.chenzhuo.fresco_01.model;

import com.bawie.chenzhuo.fresco_01.http.GoodsListener;

import java.util.Map;

/**
 * Created by asus on 2018/5/9.
 */

public interface IModel {
    void getDate(String url, Map<String,String> map, GoodsListener goodsListener);
}
