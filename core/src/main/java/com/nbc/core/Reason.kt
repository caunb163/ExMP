package com.nbc.core

abstract class Reason : Throwable() {
    abstract val errorDes: String
}

fun Throwable.toReason() = message?.let { GenericError(it) } ?: GenericError()

object ReasonDescription {
    const val generic = "Something went wrong"
    const val network = "Network error"
    const val empty = "Response empty data"
    const val response = "Oops, seems we got a server error"
    const val timeout = "Server time out"
    const val notfound = "Not found"
    const val authorized = "User unauthorized"
}

class GenericError(override val errorDes: String = ReasonDescription.generic) : Reason()

sealed class NetworkError(override val errorDes: String) : Reason() {
    class ConnectionError : NetworkError(ReasonDescription.network)
    class ResponseError : NetworkError(ReasonDescription.response)
    class EmptyError : NetworkError(ReasonDescription.empty)
    class TimeoutError : NetworkError(ReasonDescription.timeout)
    class NotfoundError : NetworkError(ReasonDescription.notfound)
    class AnauthorizedError : NetworkError(ReasonDescription.authorized)
}