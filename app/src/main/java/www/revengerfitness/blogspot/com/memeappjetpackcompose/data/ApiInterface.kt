package www.revengerfitness.blogspot.com.memeappjetpackcompose.data

import retrofit2.Response
import retrofit2.http.GET
import www.revengerfitness.blogspot.com.memeappjetpackcompose.AllMemesData
import www.revengerfitness.blogspot.com.memeappjetpackcompose.Meme

interface ApiInterface {

    @GET("get_memes")
    suspend fun getMemesList() : Response<AllMemesData>
}