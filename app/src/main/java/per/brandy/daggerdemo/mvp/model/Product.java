package per.brandy.daggerdemo.mvp.model;

import android.util.Log;

import javax.inject.Inject;

/**
 * 作者：JY on 2019/5/18 15:50
 * 邮箱：605695348@qq.com
 * <p>
 * 功能描述：
 */
public class Product {
    private static final String TAG = Product.class.getName();
    private Worker mWorker;

    @Inject
    public Product(Worker worker) {
        Log.d(TAG, "product created ; worker: " + worker);
        mWorker = worker;
    }

//    @Inject
//    public Product() {
//    }

    public void showMe() {
        Log.d(TAG, "Product show: "+this);
    }
}
