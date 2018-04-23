package com.yijian2033.mdemo2.present;

import com.yijian2033.mdemo2.view.BaseView;

/**
 * @author zhangyj
 * @version [MDemo2, 2018-04-23]
 */
public class BasePresent<V extends BaseView> {

    private V view;

    public void attachView(V view) {
        this.view = view;
    }

    public void dettachView() {
        view = null;
    }

    public boolean isAttachView() {
        return view != null;
    }

    public V getView() {
        return view;
    }


}
