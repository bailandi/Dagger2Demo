package per.brandy.daggerdemo;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import dagger.Lazy;
import per.brandy.daggerdemo.di.component.AppComponent;
import per.brandy.daggerdemo.di.component.DaggerAppComponent;
import per.brandy.daggerdemo.di.module.MachineModule;
import per.brandy.daggerdemo.mvp.model.Factory;
import per.brandy.daggerdemo.mvp.model.Machine;

/**
 * 作者：JY on 2019/5/19 11:06
 * 邮箱：605695348@qq.com
 * <p>
 * 功能描述：
 */
public class App extends Application {

    @Inject
    Factory mFactory;

//    @Inject
//    Factory mFactory2;

    private AppComponent mAppComponent;


    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent
                .builder()
                .application(this)
                .machineModule(
                        new MachineModule.Builder()
                                .machine1(new Machine("machine1"))
                                .machine2(new Machine("machine2"))
                                .build())
                .build();
        mAppComponent
                .inject(this);

        mFactory.showMe();

//        mFactory2.showMe();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        mAppComponent = null;
    }
}
