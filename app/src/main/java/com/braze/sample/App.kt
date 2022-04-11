package com.braze.sample

import android.app.Application
import com.braze.BrazeActivityLifecycleCallbackListener
import io.sentry.android.core.SentryAndroid

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initBraze()
        initSentry()
    }

    private fun initBraze() {
        registerActivityLifecycleCallbacks(BrazeActivityLifecycleCallbackListener())
    }

    private fun initSentry() {
        SentryAndroid.init(this) {
            it.environment = "test"
        }
    }
}
