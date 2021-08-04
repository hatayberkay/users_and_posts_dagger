package something.about.hatay.users_and_posts_dagger.di.auth;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import something.about.hatay.users_and_posts_dagger.models.User;
import something.about.hatay.users_and_posts_dagger.network.auth.AuthApi;
@Module
public class AuthModule {
    @AuthScope
    @Provides
    @Named("auth_user")
    static User someUser(){
        return new User();
    }

    @AuthScope
    @Provides
    static AuthApi provideAuthApi(Retrofit retrofit){
        return retrofit.create(AuthApi.class);
    }
}
