package com.nbc.data.repository

import com.nbc.core.State
import com.nbc.data.local.LocalStorage
import com.nbc.domain.usecase.splash.SplashRepository
import com.nbc.domain.usecase.splash.SplashUsecase

class SplashRepositoryImpl(
    private val localStorage: LocalStorage
) : SplashRepository {
    override suspend fun initial(): State<SplashUsecase.SplashState> {
        return if (localStorage.getSharePreference().getBoolean(LocalStorage.FIRST_OPEN, true)) {
            localStorage.getSharePreference().edit().putBoolean(LocalStorage.FIRST_OPEN, false).apply()
            State.Success(SplashUsecase.SplashState.OpenOther)
        } else State.Success(SplashUsecase.SplashState.OpenHome)
    }
}