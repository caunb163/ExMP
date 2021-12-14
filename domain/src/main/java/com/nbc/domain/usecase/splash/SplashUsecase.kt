package com.nbc.domain.usecase.splash

import com.nbc.core.State
import com.nbc.core.base.BaseUsecase
import kotlinx.coroutines.flow.FlowCollector

class SplashUsecase(
    private val repository: SplashRepository
) : BaseUsecase<SplashUsecase.SplashState, Nothing>() {

    override suspend fun FlowCollector<State<SplashState>>.run(params: Nothing) {
        emit(repository.initial())
    }

    sealed class SplashState {
        object OpenHome : SplashState()
        object OpenOther : SplashState()
    }

}