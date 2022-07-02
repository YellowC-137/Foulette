package com.example.foulette.src.Maps

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.os.Build
import android.os.Bundle
import android.os.Looper
import android.util.Log
import androidx.core.app.ActivityCompat
import com.example.foulette.config.BaseActivity
import com.example.foulette.databinding.ActivityMapBinding
import com.google.android.gms.location.*
import java.security.SecureRandom
import java.util.*

class MapActivity : BaseActivity<ActivityMapBinding>(ActivityMapBinding::inflate) {

    private var mFusedLocationProviderClient: FusedLocationProviderClient? = null // 현재 위치를 가져오기 위한 변수
    lateinit var mLastLocation: Location // 위치 값을 가지고 있는 객체
    internal lateinit var mLocationRequest: LocationRequest // 위치 정보 요청의 매개변수를 저장하는
    private val REQUEST_PERMISSION_LOCATION = 10
    private var currentLocation = DoubleArray(2)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


}