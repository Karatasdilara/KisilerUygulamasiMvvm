package com.example.kisileruygulamasimvvm.data_entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Kisiler(@SerializedName("kisi_id") var kisi_id: Int,
              @SerializedName("kisi_ad") var kisi_ad: String,
              @SerializedName("kisi_tel") var kisi_tel:String): Serializable {

}