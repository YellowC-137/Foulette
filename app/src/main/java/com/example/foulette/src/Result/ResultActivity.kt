package com.example.foulette.src.Result

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.example.foulette.config.BaseActivity
import com.example.foulette.databinding.ActivityResultBinding
import com.example.foulette.databinding.ActivitySplashBinding
import com.example.foulette.src.Main.MainActivity

class ResultActivity : BaseActivity<ActivityResultBinding>(ActivityResultBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
    }

}