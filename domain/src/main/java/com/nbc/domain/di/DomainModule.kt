package com.nbc.domain.di

import com.nbc.domain.usecase.splash.SplashUsecase
import org.koin.dsl.module

val domainModule = module {
    factory { SplashUsecase(get()) }
}