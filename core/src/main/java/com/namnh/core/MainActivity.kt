package com.namnh.core

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val coreLib = CoreLib()
        coreLib.testFun()

        object : Thread() {
            override fun run() {
                val request = Request.Builder()
                    .get()
                    .url(" https://api.github.com/users/vRallev")
                    .build()

                try {
                    val message = OkHttpClient()
                        .newCall(request)
                        .execute()
                        .message

                    runOnUiThread { Toast.makeText(this@MainActivity, "Message: $message", Toast.LENGTH_SHORT).show() }

                } catch (e: IOException) {
                    Log.e("Demo", e.message, e)
                }

            }
        }.start()
    }
}
