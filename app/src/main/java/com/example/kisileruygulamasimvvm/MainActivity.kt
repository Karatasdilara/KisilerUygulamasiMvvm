package com.example.kisileruygulamasimvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint

/*
********Retrofit**********
* Android uygulamalarında kullanılan bir kütüphane
* Web servisleriyle iletişim kurmak için kullanılır
* Application Programming Interface = Uugulama Programlama Arayüzü
* http ve https isteklerini oluşturmak ve yanıtları işlemek için kullanılır.
* api http ile başlıyorsa manifest dosyasına android:usesCleartextTraffic="true" eklemek gerekir

 */

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}