package mx.org.vantisclean.data

import mx.org.vantisclean.data.model.RickModel
import mx.org.vantisclean.data.model.RickProvider
import mx.org.vantisclean.data.network.RickService


class RickRepository {

    private val api = RickService()

    suspend fun getAllProperties(): List<RickModel> {
        val response = api.getProperties()
        RickProvider.properties = response
        return response
    }
}