package com.example.kisileruygulamasimvvm.retrofit

import com.example.kisileruygulamasimvvm.data_entity.Kisiler

class ApiUtils {
    companion object {
        val BASE_URL = "http://kasimadalan.pe.hu/"

        fun getKisilerDao(): KisilerDao {
            return RetrofitClient.getClient(BASE_URL).create(KisilerDao::class.java)
        }
    }
}