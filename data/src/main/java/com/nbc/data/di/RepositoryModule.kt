package com.nbc.data.di

import com.nbc.data.repository.SplashRepositoryImpl
import com.nbc.domain.usecase.splash.SplashRepository
import org.koin.dsl.module

val repositoryModule = module {
//    factory<SplashRepository> { SplashRepositoryImpl(get()) }
}