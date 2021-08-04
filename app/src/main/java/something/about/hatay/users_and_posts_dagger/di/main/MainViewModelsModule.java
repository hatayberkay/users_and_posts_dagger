package something.about.hatay.users_and_posts_dagger.di.main;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import something.about.hatay.users_and_posts_dagger.di.ViewModelKey;
import something.about.hatay.users_and_posts_dagger.ui.main.posts.PostsViewModel;
import something.about.hatay.users_and_posts_dagger.ui.main.profile.ProfileViewModel;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindProfileViewModel(ProfileViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PostsViewModel.class)
    public abstract ViewModel bindPostsViewModel(PostsViewModel viewModel);
}
