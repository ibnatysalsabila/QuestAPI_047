package com.example.questapi_047.uicontroller.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.questapi_047.modeldata.DetailSiswa
import com.example.questapi_047.modeldata.UIStateSiswa
import com.example.questapi_047.modeldata.toDataSiswa
import com.example.questapi_047.repositori.RepositoryDataSiswa
import retrofit2.Response


class EntryViewModel(private val repositoryDataSiswa: RepositoryDataSiswa):
    ViewModel(){
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    private fun validasiInput(uiState: DetailSiswa = uiStateSiswa.detailSiswa):
            Boolean{
        return with(uiState){
            nama.isNotBlank() && alamat.isNotBlank() && telpon.isNotBlank()
        }
    }
