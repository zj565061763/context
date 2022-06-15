package com.sd.lib.context;

import android.content.Context;

public class FContext {
    private static Context sContext;

    protected FContext() {
    }

    public static void set(Context context) {
        if (context == null) return;
        sContext = context.getApplicationContext();
    }

    public static Context get() {
        return sContext;
    }
}