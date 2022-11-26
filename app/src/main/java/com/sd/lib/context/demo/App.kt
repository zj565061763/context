package com.sd.lib.context.demo

import android.app.Application
import com.sd.lib.context.FContext

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        logMsg {
            """
            Application onCreate
            Application:$this
            context:${FContext.get()}
            appName:${Constant.APP_NAME}
        """.trimIndent()
        }
    }
}