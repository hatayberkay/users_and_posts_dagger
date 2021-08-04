package something.about.hatay.users_and_posts_dagger;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import something.about.hatay.users_and_posts_dagger.di.DaggerAppComponent;

public class BaseApplication extends DaggerApplication{
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
