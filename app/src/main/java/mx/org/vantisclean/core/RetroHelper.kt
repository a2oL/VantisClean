package mx.org.vantisclean.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}