package com.akaishi.springbootlearning.controller

import com.akaishi.springbootlearning.model.Data
import com.akaishi.springbootlearning.service.DataService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/aaa")
class DataController(val dataService: DataService) {

    @GetMapping
    fun getData(): List<Data> {
        return dataService.getData()
    }
}