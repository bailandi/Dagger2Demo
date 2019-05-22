package per.brandy.daggerdemo.mvp.model;

import android.util.Log;

/**
 * 作者：JY on 2019/5/19 13:16
 * 邮箱：605695348@qq.com
 * <p>
 * 功能描述：
 */
public  class Machine {
    private static final String TAG = Machine.class.getName();
    private String name;

    public Machine(String name) {
        this.name = name;
        Log.d(TAG, "Machine: " + name);
    }

    @Override
    public String toString() {
        return "Machine{" +
                "name='" + name + '\'' +
                '}';
    }
}
