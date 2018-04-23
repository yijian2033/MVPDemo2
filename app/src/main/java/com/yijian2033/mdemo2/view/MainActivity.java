package com.yijian2033.mdemo2.view;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.yijian2033.mdemo2.R;
import com.yijian2033.mdemo2.present.UserPresent;

public class MainActivity extends AppCompatActivity implements UserView {

    private UserPresent presenter;
    private TextView text;
    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setCancelable(false);
        presenter = new UserPresent();
        presenter.attachView(this);

    }

    // button 点击事件调用方法
    public void getData(View view) {
        presenter.getData("normal");
    }

    // button 点击事件调用方法
    public void getDataForFailure(View view) {
        presenter.getData("failure");
    }

    // button 点击事件调用方法
    public void getDataForError(View view) {
        presenter.getData("error");
    }

    @Override
    public void showData(String Data) {
        text.setText(Data);
    }

    @Override
    public void showLoading() {
        mProgressDialog.show();
    }

    @Override
    public void hideLoading() {
        mProgressDialog.dismiss();
    }

    @Override
    public void showToast(String msg) {

    }

    @Override
    public void showErr(Throwable throwable) {

    }

    @Override
    public Context getContext() {
        return getApplicationContext();
    }
}
