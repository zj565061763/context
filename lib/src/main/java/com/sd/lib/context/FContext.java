package com.sd.lib.context;

import android.content.Context;

public class FContext
{
    private static Context sContext;

    protected FContext()
    {
    }

    static final void set(Context context)
    {
        if (context == null)
            return;

        sContext = context.getApplicationContext();
    }

    public static final Context get()
    {
        return sContext;
    }
}