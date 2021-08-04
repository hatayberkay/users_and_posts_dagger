package something.about.hatay.users_and_posts_dagger.network.main;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import something.about.hatay.users_and_posts_dagger.models.Post;

public interface MainApi {
    @GET("posts")
    Flowable<List<Post>> getPostsFromUser(
            @Query("userId") int id
    );
}
