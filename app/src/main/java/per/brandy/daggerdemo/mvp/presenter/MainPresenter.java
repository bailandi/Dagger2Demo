package per.brandy.daggerdemo.mvp.presenter;

import javax.inject.Inject;

import per.brandy.daggerdemo.mvp.model.Factory;

/**
 * 作者：JY on 2019/5/19 12:57
 * 邮箱：605695348@qq.com
 * <p>
 * 功能描述：
 */
public class MainPresenter  {

    @Inject
    Factory mFactory;

    @Inject
    public MainPresenter() {

    }

    public void hasFactory(){
        mFactory.showMe();
    }
}
