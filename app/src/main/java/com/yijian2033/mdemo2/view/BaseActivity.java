package com.yijian2033.mdemo2.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * @author zhangyj
 * @version [MDemo2, 2018-04-23]
 */
public class BaseActivity extends Activity implements BaseView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showToast(String msg) {

    }

    @Override
    public void showErr(Throwable throwable) {

    }

    @Override
    public Context getContext() {
        return null;
    }
}
