package com.yijian2033.mdemo2.mode;

import java.util.Map;

/**
 * @author zhangyj
 * @version [MDemo2, 2018-04-23]
 */
public abstract class BaseMode<T> {

    protected String[] params;

    public BaseMode params(String... params) {
        this.params = params;
        return this;
    }

    public abstract void execute(CallBack<T> callBack);

    public void executeGet(String url, CallBack<T> callBack) {
    }

    public void executePost(String url, Map map, CallBack<T> callBack) {
    }

}
