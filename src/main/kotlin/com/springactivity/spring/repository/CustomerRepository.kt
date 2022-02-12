package com.springactivity.spring.repository

import com.springactivity.spring.dto.OrderResponse
import com.springactivity.spring.model.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query


interface CustomerRepository : JpaRepository<Customer?, Int?> {
    @get:Query("SELECT new com.springactivity.spring.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
    val joinInformation: List<OrderResponse?>?
}