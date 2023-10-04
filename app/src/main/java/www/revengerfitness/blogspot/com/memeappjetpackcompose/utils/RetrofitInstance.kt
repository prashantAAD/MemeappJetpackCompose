package www.revengerfitness.blogspot.com.memeappjetpackcompose.utils

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import www.revengerfitness.blogspot.com.memeappjetpackcompose.data.ApiInterface

object RetrofitInstance {
    val api : ApiInterface by lazy {
        retrofit2.Retrofit.Builder()
            .baseUrl(Util.Base)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }
}