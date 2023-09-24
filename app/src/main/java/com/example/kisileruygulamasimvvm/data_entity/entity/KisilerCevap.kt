package com.example.kisileruygulamasimvvm.data_entity.entity

import com.example.kisileruygulamasimvvm.data_entity.Kisiler
import com.google.gson.annotations.SerializedName

data class KisilerCevap(@SerializedName("kisiler") var kisiler:List<Kisiler>,
                        @SerializedName("success") var succes:Int) {
}