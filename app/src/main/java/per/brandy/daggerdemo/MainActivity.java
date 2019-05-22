package per.brandy.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.Lazy;
import per.brandy.daggerdemo.di.component.DaggerMainComponent;
import per.brandy.daggerdemo.di.component.MainComponent;
import per.brandy.daggerdemo.mvp.model.Factory;
import per.brandy.daggerdemo.mvp.model.Product;
import per.brandy.daggerdemo.mvp.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity {
    @Inject
    Lazy<Product> mProduct;



    @Inject
    MainPresenter mPresenter;

    @Inject
    Factory mFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainComponent mainComponent = DaggerMainComponent
                .builder()
                .appComponent(((App) getApplication()).getAppComponent())
                .build();
        mainComponent
                .inject(this);

        mProduct.get().showMe();
        mFactory.showMe();
        mFactory.showMe();

        mPresenter.hasFactory();
    }
}
