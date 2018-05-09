package com.bawie.chenzhuo.fresco_01.view;

import com.bawie.chenzhuo.fresco_01.model.GoodsBean;

import java.util.List;

/**
 * Created by asus on 2018/5/9.
 */

public interface IMainView {
    void ShowGoods(List<GoodsBean.DataBean> list);

    int pscid();
}
