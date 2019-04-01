package com.namnh.app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.namnh.base.BaseLib
import com.namnh.core.CoreLib
import com.namnh.stream.StreamLib

class MainActivity : AppCompatActivity() {
    lateinit var base: BaseLib
    lateinit var core: CoreLib
    lateinit var stream: StreamLib

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
