package com.bawie.chenzhuo.fresco_01.model;

import com.bawie.chenzhuo.fresco_01.http.GoodsListener;
import com.bawie.chenzhuo.fresco_01.http.OKHttpUtils;

import java.util.Map;

/**
 * Created by asus on 2018/5/9.
 */

public class IModelImpl implements IModel {
    @Override
    public void getDate(String url, Map<String, String> map, final GoodsListener goodsListener) {
        OKHttpUtils okHttpUtils=new OKHttpUtils();
        okHttpUtils.okPost(url,map);
        okHttpUtils.setOnLoginListener(new OKHttpUtils.LoginListener() {
            @Override
            public void loginSuccess(String json) {
                goodsListener.GoodsSuccess(json);
            }

            @Override
            public void loginError(String error) {
                goodsListener.GoodsError(error);
            }
        });
    }
}
