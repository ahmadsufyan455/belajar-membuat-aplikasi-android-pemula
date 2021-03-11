package com.fyndev.moto.profile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import coil.transform.CircleCropTransformation
import com.fyndev.moto.R
import com.fyndev.moto.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgPhoto.load(R.drawable.fyn) {
            crossfade(true)
            crossfade(2000)
            transformations(CircleCropTransformation())
        }

        binding.icBack.setOnClickListener { finish() }
    }
}