package per.brandy.daggerdemo.di.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * 作者：JY on 2019/5/19 12:05
 * 邮箱：605695348@qq.com
 * <p>
 * 功能描述：
 */
@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {}

