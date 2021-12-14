package com.nbc.core.base

import com.nbc.core.GenericError
import com.nbc.core.NetworkError
import com.nbc.core.Reason
import com.nbc.core.State

abstract class BaseResponse<T> {
    val data: T? = null
    val status: String? = null
    val message: String? = null
}

fun <T> BaseResponse<T>.toState(): State<Any> {
    return if (status == "success") {
        if (data != null) {
            State.Success(data)
        } else State.Failure(NetworkError.EmptyError())
    } else State.Failure(getReason())
}

fun <T> BaseResponse<T>.getReason(): Reason {
    return if (message.isNullOrEmpty()) {
        NetworkError.ResponseError()
    } else GenericError()
}