package mx.org.vantisclean.domain

import mx.org.vantisclean.data.RickRepository


class GetRicksUseCase {

    private val repository = RickRepository()

    suspend operator fun invoke() = repository.getAllProperties()

}