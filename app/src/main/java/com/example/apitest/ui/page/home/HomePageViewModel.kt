package com.example.apitest.ui.page.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apitest.domain.HarryPotterRepository
import com.example.apitest.domain.HarryPotterRepositoryImp
import com.example.apitest.ui.model.UiHarryPotterCharacter
import com.example.apitest.ui.model.toUiHarryPotterCharacter
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomePageViewModel (application: Application): AndroidViewModel(application) {
    private val repository : HarryPotterRepository = HarryPotterRepositoryImp(application) //obj of repository


    private val _harryPotterCharacters = MutableStateFlow<List<UiHarryPotterCharacter>>(listOf(/*initial value is an empty list*/))
    val harryPotterCharacters  = _harryPotterCharacters.asStateFlow()

        init{
            viewModelScope.launch {
                val apiHarryPotterCharactersResponses = repository.getAllCharacters()
                _harryPotterCharacters.value = apiHarryPotterCharactersResponses.map { it.toUiHarryPotterCharacter() }
            }
    }
}