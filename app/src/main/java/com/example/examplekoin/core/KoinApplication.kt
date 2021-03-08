package com.example.examplekoin.core

import android.app.Application
import com.example.examplekoin.di.apiModules
import com.example.examplekoin.di.homeModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KoinApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@KoinApplication)

            modules(
                apiModules,
                homeModule
            )
        }
    }
}