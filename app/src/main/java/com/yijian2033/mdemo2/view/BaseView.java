package com.yijian2033.mdemo2.view;

import android.content.Context;

/**
 * @author zhangyj
 * @version [MDemo2, 2018-04-23]
 */
public interface BaseView {
    /**
     * 显示正在加载view
     */
    void showLoading();

    /**
     * 关闭正在加载view
     */
    void hideLoading();

    /**
     * 显示提示
     *
     * @param msg
     */
    void showToast(String msg);

    /**
     * 显示请求错误提示
     */
    void showErr(Throwable throwable);

    /**
     * 获取上下文
     *
     * @return 上下文
     */
    Context getContext();
}
