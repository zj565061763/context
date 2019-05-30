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
        if (sContext == null)
        {
            sContext = context.getApplicationContext();
            init(sContext);
        }
    }

    private static void init(Context context)
    {
        final String initClass = context.getResources().getString(R.string.lib_context_init_class);
        if (initClass != null && initClass.length() > 0)
        {
            try
            {
                Class.forName(initClass).newInstance();
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