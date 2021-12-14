package com.nbc.domain.usecase.splash

import com.nbc.core.State


interface SplashRepository {
    suspend fun initial(): State<SplashUsecase.SplashState>

}