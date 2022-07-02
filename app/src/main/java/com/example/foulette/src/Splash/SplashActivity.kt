package com.example.foulette.src.Splash

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Handler
import com.example.foulette.config.BaseActivity
import com.example.foulette.databinding.ActivitySplashBinding
import com.example.foulette.src.Main.MainActivity
import android.util.Base64
import android.util.Log
import java.security.MessageDigest

class SplashActivity : BaseActivity<ActivitySplashBinding>(ActivitySplashBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val SPLASH_VIEW_TIME: Long = 1500 //1초

        Handler().postDelayed({
            hash()
            startActivity(Intent(this, MainActivity::class.java))
        }, SPLASH_VIEW_TIME)


    }

    private fun hash(){
        try {
            val information =
                packageManager.getPackageInfo(packageName, PackageManager.GET_SIGNING_CERTIFICATES)
            val signatures = information.signingInfo.apkContentsSigners
            val md = MessageDigest.getInstance("SHA")
            for (signature in signatures) {
                val md: MessageDigest
                md = MessageDigest.getInstance("SHA")
                md.update(signature.toByteArray())
                var hashcode = String(Base64.encode(md.digest(), 0))
                Log.d("hashcode", "" + hashcode)
            }
        } catch (e: Exception) {
            Log.d("hashcode", "에러::" + e.toString())

        }
    }

}

