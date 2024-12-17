package ch.walica.temp171224_4tp2_retrofit;

import java.util.List;

import ch.walica.temp171224_4tp2_retrofit.models.Country;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("europe")
    Call<List<Country>> getEuropeCountries();

    @GET("{continent}")
    Call<List<Country>> getCountries(@Path("continent") String continent);
}
