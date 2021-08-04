package something.about.hatay.users_and_posts_dagger.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import something.about.hatay.users_and_posts_dagger.ui.main.MainActivity;
import something.about.hatay.users_and_posts_dagger.di.auth.AuthModule;
import something.about.hatay.users_and_posts_dagger.di.auth.AuthScope;
import something.about.hatay.users_and_posts_dagger.di.auth.AuthViewModelsModule;
import something.about.hatay.users_and_posts_dagger.di.main.MainFragmentBuildersModule;
import something.about.hatay.users_and_posts_dagger.di.main.MainModule;
import something.about.hatay.users_and_posts_dagger.di.main.MainScope;
import something.about.hatay.users_and_posts_dagger.di.main.MainViewModelsModule;
import something.about.hatay.users_and_posts_dagger.ui.auth.AuthActivity;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();


    @MainScope
    @ContributesAndroidInjector(
            modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();

}
