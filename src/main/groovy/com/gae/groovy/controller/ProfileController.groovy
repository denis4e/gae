package com.gae.groovy.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/groovy")
class ProfileController {

    @GetMapping(value = "/profile")
    def home(){
       return "profile controller"
    }
}
