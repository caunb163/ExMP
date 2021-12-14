package com.nbc.core

sealed class State<out T> {
    object Loading : State<Nothing>()
    data class Success<out T>(val data: T): State<T>()
    data class Failure(val reason: Reason): State<Reason>()
}

inline fun <T> State<T>.handle(
    loadingBlock: () -> Unit,
    successBlock: (T) -> Unit,
    failureBlock: (Reason) -> Unit
){
    when(this) {
        is State.Loading -> loadingBlock()
        is State.Success -> successBlock(data)
        is State.Failure -> failureBlock(reason)
    }
}
