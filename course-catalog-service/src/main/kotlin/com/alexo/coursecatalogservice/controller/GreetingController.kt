package com.alexo.coursecatalogservice.controller

import com.alexo.coursecatalogservice.service.GreetingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/v1/greetings")
class GreetingController(
    val greetingService: GreetingService // inject service class
) {

    @GetMapping("/{name}")
    fun retrieveGreeting(@PathVariable("name") name: String): String {

        return greetingService.retrieveGreeting(name)
    }
}