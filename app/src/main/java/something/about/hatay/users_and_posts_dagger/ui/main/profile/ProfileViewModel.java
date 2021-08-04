package something.about.hatay.users_and_posts_dagger.ui.main.profile;

import android.util.Log;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import something.about.hatay.users_and_posts_dagger.SessionManager;
import something.about.hatay.users_and_posts_dagger.models.User;
import something.about.hatay.users_and_posts_dagger.ui.auth.AuthResource;

public class ProfileViewModel extends ViewModel {
    private static final String TAG = "DaggerExample";

    private final SessionManager sessionManager;

    @Inject
    public ProfileViewModel(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
        Log.d(TAG, "ProfileViewModel: viewmodel is ready...");
    }

    public LiveData<AuthResource<User>> getAuthenticatedUser(){
        return sessionManager.getAuthUser();
    }
}
