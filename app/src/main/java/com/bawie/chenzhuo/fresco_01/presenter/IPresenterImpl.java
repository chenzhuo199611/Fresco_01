package com.bawie.chenzhuo.fresco_01.presenter;

import com.bawie.chenzhuo.fresco_01.http.GoodsListener;
import com.bawie.chenzhuo.fresco_01.http.Httpfig;
import com.bawie.chenzhuo.fresco_01.model.GoodsBean;
import com.bawie.chenzhuo.fresco_01.model.IModel;
import com.bawie.chenzhuo.fresco_01.view.IMainView;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by asus on 2018/5/9.
 */

public class IPresenterImpl implements IPresenter{
    @Override
    public void getGoods(IModel iModel, final IMainView iMainView) {
        Map<String,String> map=new HashMap<>();
        map.put("pscid", iMainView.pscid()+"");
        iModel.getDate(Httpfig.goods_url, map, new GoodsListener() {
            @Override
            public void GoodsSuccess(String json) {
                Gson gson=new Gson();
                GoodsBean goodsBean = gson.fromJson(json, GoodsBean.class);
                List<GoodsBean.DataBean> data = goodsBean.getData();
                iMainView.ShowGoods(data);
            }

            @Override
            public void GoodsError(String error) {

            }
        });
    }
}
