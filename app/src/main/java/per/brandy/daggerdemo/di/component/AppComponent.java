package per.brandy.daggerdemo.di.component;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import per.brandy.daggerdemo.App;
import per.brandy.daggerdemo.di.module.AppModule;
import per.brandy.daggerdemo.di.module.MachineModule;
import per.brandy.daggerdemo.mvp.model.Factory;

/**
 * 作者：JY on 2019/5/19 11:37
 * 邮箱：605695348@qq.com
 * <p>
 * 功能描述：
 */

@Singleton
@Component(modules = {AppModule.class, MachineModule.class})
public interface AppComponent {
    void inject(App app);

    Factory factory();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        Builder machineModule(MachineModule machineModule);

        AppComponent build();
    }
}
