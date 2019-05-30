package com.sd.lib.context.demo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.sd.lib.context.FContext;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = FContext.get();
        final String appName = context.getResources().getString(R.string.app_name);
        Toast.makeText(this, "appName: " + appName, Toast.LENGTH_SHORT).show();
    }
}
