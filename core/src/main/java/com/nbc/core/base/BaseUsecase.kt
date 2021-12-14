package com.nbc.core.base

import com.nbc.core.State
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

abstract class BaseUsecase<T, in P> {
    protected abstract suspend fun FlowCollector<State<T>>.run(params: P)

    operator fun invoke(params: P) = flow<State<T>> {
        emit(State.Loading)
        run(params)
    }.flowOn(Dispatchers.IO)
}