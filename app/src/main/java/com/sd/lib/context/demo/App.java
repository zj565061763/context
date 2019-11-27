package com.sd.lib.context.demo;

import android.app.Application;
import android.util.Log;

import com.sd.lib.context.FContext;

public class App extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        Log.i(MainActivity.TAG, "onCreate:" + this + " context:" + FContext.get());
    }
}
