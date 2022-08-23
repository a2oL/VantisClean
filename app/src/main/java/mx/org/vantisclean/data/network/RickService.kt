package mx.org.vantisclean.data.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import mx.org.vantisclean.core.RetroHelper
import mx.org.vantisclean.data.model.RickModel

class RickService {

    private val retrofit = RetroHelper.getRetrofit()

    suspend fun getProperties(): List<RickModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(RickApiClient::class.java).getProperties()
            response.body() ?: emptyList()
        }
    }

}