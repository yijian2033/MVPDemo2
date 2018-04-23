package com.yijian2033.mdemo2.mode;

/**
 * @author zhangyj
 * @version [MDemo2, 2018-04-23]
 */
public class DataMode {

    public static BaseMode reques(Class name) {
        BaseMode mode = null;

        try {
            mode = (BaseMode) Class.forName(name.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return mode;
    }

}
