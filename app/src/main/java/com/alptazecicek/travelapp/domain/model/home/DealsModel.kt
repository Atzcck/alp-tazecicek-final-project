package com.alptazecicek.travelapp.domain.model.home


data class DealsModel(
    val category: String,
    val city: String,
    val country: String,
    val description: String,
    val id: String,
    val images: List<Image>,
    val isBookmark: Boolean,
    val title: String
)