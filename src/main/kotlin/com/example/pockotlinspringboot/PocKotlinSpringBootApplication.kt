package com.example.pockotlinspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class PocKotlinSpringBootApplication

fun main(args: Array<String>) {
    runApplication<PocKotlinSpringBootApplication>(*args)
}

@RestController
class MessageController {
    // listOf -> readOnly
    @GetMapping("/")
    fun index() = listOf<Message>(
        Message("1", "Hello!"),
        Message("2", "Bonjour!"),
        Message("3", "Privet!"),
    )
}

// val -> immutable
// var -> mutable
data class Message(val id: String?, val text: String)
