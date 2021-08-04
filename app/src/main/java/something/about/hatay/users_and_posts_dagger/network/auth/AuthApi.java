package something.about.hatay.users_and_posts_dagger.network.auth;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import something.about.hatay.users_and_posts_dagger.models.User;

public interface AuthApi {

    @GET("users/{id}")
    Flowable<User> getUser(
            @Path("id") int id
    );
}
