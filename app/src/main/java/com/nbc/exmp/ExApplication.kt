package com.nbc.exmp

import android.app.Application
import com.nbc.data.di.localModule
import com.nbc.data.di.repositoryModule
import com.nbc.domain.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ExApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ExApplication)
            modules(domainModule, localModule, repositoryModule)
        }
    }
}