package com.fyndev.moto.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import coil.transform.RoundedCornersTransformation
import com.fyndev.moto.data.Motor
import com.fyndev.moto.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DETAIL = "extra_detail"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val motor = intent.getParcelableExtra<Motor>(EXTRA_DETAIL)

        binding.tvName.text = motor?.name
        binding.tvPrice.text = motor?.price
        binding.tvOverview.text = motor?.overview
        binding.imgPoster.load(motor?.poster) {
            crossfade(true)
            crossfade(1000)
            transformations(RoundedCornersTransformation(10f))
        }

        binding.icBack.setOnClickListener { finish() }
    }
}