package id.ac.polbeng.DwiPitriyani.githubprofile.services

import id.ac.polbeng.DwiPitriyani.githubprofile.Config // assuming this is the correct Config class
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ServiceBuilder {
    // Create loggingInterceptor
    private val loggingInterceptor = if (BuildConfig.DEBUG) {
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    } else {
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.NONE)
    }

    // Create OkHttp client
    private val okHttp: OkHttpClient.Builder = OkHttpClient.Builder()
        .callTimeout(5, TimeUnit.SECONDS)
        .addInterceptor(loggingInterceptor)

    // Create Retrofit builder
    private val builder: Retrofit.Builder = Retrofit.Builder()
        .baseUrl(Config.BASE_URL)  // Use your correct base URL here
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttp.build())

    // Create Retrofit instance
    private val retrofit: Retrofit = builder.build()

    // Generic function to build service for any API interface
    fun <T> buildService(serviceType: Class<T>): T {
        return retrofit.create(serviceType)
    }
}
