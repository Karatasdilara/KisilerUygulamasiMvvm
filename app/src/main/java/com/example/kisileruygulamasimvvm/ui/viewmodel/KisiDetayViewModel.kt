package com.example.kisileruygulamasimvvm.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasimvvm.data_entity.repo.KisilerDaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class KisiDetayViewModel @Inject constructor (var krepo: KisilerDaRepository): ViewModel() {

    fun guncelle(kisiId: Int, kisiAd: String, kisiTel: String){
        krepo.kisiGuncelle(kisiId,kisiAd,kisiTel)

    }
}