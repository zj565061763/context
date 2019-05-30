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
        sContext = context.getApplicationContext();
        init(sContext);
    }

    private static void init(Context context)
    {
        final String className = context.getResources().getString(R.string.lib_context_init_class);
        if (className != null && className.length() > 0)
        {
            try
            {
                Class.forName(className).newInstance();
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static final Context get()
    {
        return sContext;
    }
}