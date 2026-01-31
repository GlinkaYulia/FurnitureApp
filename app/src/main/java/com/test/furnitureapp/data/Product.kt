package com.test.furnitureapp.data

data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val description: String,
    val category: String,
    val rating: Double,
    val imageUrl: String
)
