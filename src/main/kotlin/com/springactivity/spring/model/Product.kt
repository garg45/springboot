package com.springactivity.spring.model

import javax.persistence.*

@Entity
@Table(name = "product")
data class Product(
    @Id
    @GeneratedValue
    var pid: Int,
    var productName: String,
    var qty: Int,
    var price: Int,
)
