package com.akaishi.springbootlearning.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "quotes")
data class DataEntity(
    @Id
    @Column(name = "id")
    val id: String = "23432",

    @Column(name = "author_id")
    val author: String = "awdwa",

    @Column(name = "quote")
    val quote: String = "awdad"
)