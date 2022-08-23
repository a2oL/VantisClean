package mx.org.vantisclean.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import mx.org.vantisclean.data.model.RickModel
import mx.org.vantisclean.domain.GetRicksUseCase

class RickViewModel : ViewModel() {

    val rickModel = MutableLiveData<List<RickModel>>()

    var getRicksUseCase = GetRicksUseCase()

    fun onCreate() {
        viewModelScope.launch {
            val result = getRicksUseCase()
            if(!result.isNullOrEmpty()){
                rickModel.postValue(result)
            }
        }
    }
}