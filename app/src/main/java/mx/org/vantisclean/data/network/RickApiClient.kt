package mx.org.vantisclean.data.network

import mx.org.vantisclean.data.model.RickModel
import retrofit2.Response
import retrofit2.http.GET

interface RickApiClient {
    @GET("/api/character/1,2,3,4,5,6,9,10,11,12,13,14,15,16,17,18")
    suspend fun getProperties(): Response<List<RickModel>>
}