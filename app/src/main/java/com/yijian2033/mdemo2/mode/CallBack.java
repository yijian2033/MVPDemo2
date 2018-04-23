package com.yijian2033.mdemo2.mode;

/**
 * @author zhangyj
 * @version [MDemo2, 2018-04-23]
 */
public interface CallBack<T> {

    void onSuccess(T t);

    void onFailed(String msg);

    void onError(Throwable throwable);

    void onComplete();
}
