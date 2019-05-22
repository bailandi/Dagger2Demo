package per.brandy.daggerdemo.di.module;

import dagger.Module;
import dagger.Provides;
import per.brandy.daggerdemo.mvp.model.Product;
import per.brandy.daggerdemo.mvp.model.Worker;

/**
 * 作者：JY on 2019/5/18 15:57
 * 邮箱：605695348@qq.com
 * <p>
 * 功能描述：
 */
@Module
public class MainModule {

    @Provides
    public static Product provideProduct(Worker worker) {
        return new Product(worker);
    }
}
