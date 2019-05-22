package per.brandy.daggerdemo.di.module;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import per.brandy.daggerdemo.mvp.model.Machine;

/**
 * 作者：JY on 2019/5/19 13:23
 * 邮箱：605695348@qq.com
 * <p>
 * 功能描述：
 */
@Module
public class MachineModule {
    private Machine machine1;
    private Machine machine2;

    @Provides
    @Named("machine1")
    public Machine provideMachine1() {
        return machine1;
    }

    @Provides
    @Named("machine2")
    public Machine provideMachine2() {
        return machine2;
    }

    private MachineModule(Builder builder) {
        this.machine1 = builder.machine1;
        this.machine2 = builder.machine2;
    }

    public static final class Builder {
        private Machine machine1;
        private Machine machine2;

        public Builder machine1(Machine machine1) {
            this.machine1 = machine1;
            return this;
        }

        public Builder machine2(Machine machine2) {
            this.machine2 = machine2;
            return this;
        }

        public MachineModule build() {
            return new MachineModule(this);
        }
    }
}
