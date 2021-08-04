package something.about.hatay.users_and_posts_dagger.di.main;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import something.about.hatay.users_and_posts_dagger.ui.main.posts.PostsFragment;
import something.about.hatay.users_and_posts_dagger.ui.main.profile.ProfileFragment;

@Module
public abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();

    @ContributesAndroidInjector
    abstract PostsFragment contributePostsFragment();
}