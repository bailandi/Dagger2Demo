package per.brandy.daggerdemo.mvp.model;

import android.util.Log;

/**
 * 作者：JY on 2019/5/19 11:34
 * 邮箱：605695348@qq.com
 * <p>
 * 功能描述：
 */
public abstract class Factory {
    private static final String TAG = Factory.class.getName();

    public Factory(Machine machine) {
        Log.d(TAG, "Factory created :" + machine.toString());
    }

    public void showMe() {
        Log.d(TAG, "Factory show: " + this);
    }
}
