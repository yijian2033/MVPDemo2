package com.yijian2033.mdemo2.mode;

import android.os.Handler;

/**
 * @author zhangyj
 * @version [MDemo2, 2018-04-23]
 */
public class UserMode extends BaseMode<String> {


    @Override
    public void execute(final CallBack<String> callBack) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (params[0]) {
                    case "normal":
                        callBack.onSuccess("根据参数" + params[0] + "的请求网络数据成功");
                        break;
                    case "failure":
                        callBack.onFailed("请求失败：参数有误 : " + params[0]);
                        break;
                    case "error":
                        callBack.onError(new Throwable("网络请求错误！！！！！"));
                        break;
                }
                callBack.onComplete();
            }

        }, 1000);
    }
}
