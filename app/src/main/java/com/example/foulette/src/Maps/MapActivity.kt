package com.example.foulette.src.Maps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foulette.R
import com.example.foulette.config.BaseActivity
import com.example.foulette.databinding.ActivityMapBinding
import net.daum.mf.map.api.MapView

class MapActivity : BaseActivity<ActivityMapBinding>(ActivityMapBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val mapView = MapView(this)
        binding.mapView.addView(mapView)

    }
}