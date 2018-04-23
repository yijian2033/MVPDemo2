package com.yijian2033.mdemo2.present;

import com.yijian2033.mdemo2.mode.CallBack;
import com.yijian2033.mdemo2.mode.DataMode;
import com.yijian2033.mdemo2.mode.UserMode;
import com.yijian2033.mdemo2.view.UserView;

/**
 * @author zhangyj
 * @version [MDemo2, 2018-04-23]
 */
public class UserPresent extends BasePresent<UserView> {

    public void getData(String msg) {

        if (!isAttachView()) {
            return;
        }

        getView().showLoading();

        DataMode.reques(UserMode.class)
                .params(msg)
                .execute(new CallBack<String>() {
                    @Override
                    public void onSuccess(String s) {
                        getView().showData(s);
                    }

                    @Override
                    public void onFailed(String msg) {
                        getView().showData(msg);
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        getView().showErr(throwable);
                    }

                    @Override
                    public void onComplete() {
                        getView().hideLoading();
                    }
                });

    }

}
