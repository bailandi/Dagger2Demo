package per.brandy.daggerdemo.di.component;

import dagger.Component;
import per.brandy.daggerdemo.MainActivity;
import per.brandy.daggerdemo.di.module.MainModule;
import per.brandy.daggerdemo.di.scope.ActivityScope;

/**
 * 作者：JY on 2019/5/18 15:59
 * 邮箱：605695348@qq.com
 * <p>
 * 功能描述：
 */
@ActivityScope
@Component(modules = {MainModule.class}, dependencies = {AppComponent.class})
public interface MainComponent {
    void inject(MainActivity activity);

}
