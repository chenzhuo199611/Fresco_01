package com.bawie.chenzhuo.fresco_01.http;

/**
 * Created by asus on 2018/5/9.
 */

public interface GoodsListener {
    void GoodsSuccess(String json);
    void GoodsError(String error);
}
