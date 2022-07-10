package com.lux.ex098preferencefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.github.chrisbanes.photoview.PhotoView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        val pv=findViewById<PhotoView>(R.id.phv)
        Glide.with(this).load("https://cdn.pixabay.com/photo/2021/02/17/14/59/monster-6024510_1280.jpg").into(pv)
    }
}