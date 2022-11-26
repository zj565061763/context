package com.sd.lib.context.demo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sd.demo.context.R
import com.sd.lib.context.FContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logMsg { "Activity onCreate context:${FContext.get()}" }
    }
}

inline fun logMsg(block: () -> String) {
    Log.i("context-demo", block())
}