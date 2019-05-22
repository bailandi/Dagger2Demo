package per.brandy.daggerdemo.di.module;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import per.brandy.daggerdemo.mvp.model.Factory;
import per.brandy.daggerdemo.mvp.model.FactoryA;
import per.brandy.daggerdemo.mvp.model.FactoryB;
import per.brandy.daggerdemo.mvp.model.Machine;

/**
 * 作者：JY on 2019/5/19 11:35
 * 邮箱：605695348@qq.com
 * <p>
 * 功能描述：
 */
@Module
public abstract class AppModule {

//    @Singleton
//    @Binds
//    public abstract Factory bindsFactory(FactoryB factoryB);

    @Singleton
    @Binds
    public abstract Factory bindsFactory(@Named("factoryA") Factory factory);

    @Singleton
    @Provides
    @Named("factoryA")
    public static Factory providesFactoryA(@Named("machine1") Machine machine) {
        return new FactoryA(machine);
    }

    @Singleton
    @Provides
    @Named("factoryB")
    public static Factory providesFactoryB(@Named("machine2") Machine machine) {
        return new FactoryB(machine);
    }

}
