package com.springactivity.spring.model

import javax.persistence.*

@Entity
@Table(name = "customer")
data class Customer(
    @Id
    @GeneratedValue
    var id: Int,
    var name: String,
    var email: String,
    var gender: String,
    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JoinColumn(name = "cp_fk", referencedColumnName = "id")
    var products: MutableList<Product>

)