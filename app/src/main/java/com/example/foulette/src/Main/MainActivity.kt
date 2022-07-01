package com.example.foulette.src.Main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foulette.R
import com.example.foulette.config.BaseActivity
import com.example.foulette.databinding.ActivityMainBinding
import com.example.foulette.src.Maps.MapActivity
import com.example.foulette.src.Settings.SettingActivity

class MainActivity : BaseActivity<ActivityMainBinding>
    (ActivityMainBinding::inflate) {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.rouletteBtn.setOnClickListener {
            showToast("GO")
            startActivity(Intent(this,MapActivity::class.java))
        }

        binding.settingBtn.setOnClickListener {
            startActivity(Intent(this,SettingActivity::class.java))
        }


    }
}