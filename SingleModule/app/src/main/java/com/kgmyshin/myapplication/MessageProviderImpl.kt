package com.kgmyshin.myapplication

import javax.inject.Inject

class MessageProviderImpl @Inject constructor() : MessageProvider {
    override fun provide(): String = "こんにちは"
}