package something.about.hatay.users_and_posts_dagger.di.main;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import something.about.hatay.users_and_posts_dagger.network.main.MainApi;
import something.about.hatay.users_and_posts_dagger.ui.main.posts.PostsRecyclerAdapter;

@Module
public class MainModule {

    @MainScope
    @Provides
    static PostsRecyclerAdapter provideAdapter(){
        return new PostsRecyclerAdapter();
    }

    @MainScope
    @Provides
    static MainApi provideMainApi(Retrofit retrofit){
        return retrofit.create(MainApi.class);
    }
}
