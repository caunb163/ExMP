package com.nbc.data.di

import androidx.preference.PreferenceManager
import org.koin.dsl.module

val localModule = module {
    factory { PreferenceManager.getDefaultSharedPreferences(get()) }
}