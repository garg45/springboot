package com.springactivity.spring.controller

import com.springactivity.spring.dto.OrderRequest
import com.springactivity.spring.dto.OrderResponse
import com.springactivity.spring.model.Customer
import com.springactivity.spring.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class OrderController(
    @Autowired val customerRepository: CustomerRepository
) {
    @PostMapping("/placeOrder")
    fun placeOrder(@RequestBody request: OrderRequest): Customer? {
        return customerRepository.save(request.customer)
    }

    @GetMapping("/findAllOrders")
    open fun findAllOrders(): MutableList<Customer?>? {
        return customerRepository.findAll()
    }

    @GetMapping("/getInfo")
    fun getJoinInformation(): List<OrderResponse?>? {
        return customerRepository.joinInformation
    }

}