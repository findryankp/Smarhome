package info.androidhive.androidlocation;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiClient {
    @GET("lock-nol")
    Call<String> nool();
}
