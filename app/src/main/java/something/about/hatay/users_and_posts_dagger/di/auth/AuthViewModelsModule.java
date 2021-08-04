package something.about.hatay.users_and_posts_dagger.di.auth;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import something.about.hatay.users_and_posts_dagger.di.ViewModelKey;
import something.about.hatay.users_and_posts_dagger.ui.auth.AuthViewModel;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}