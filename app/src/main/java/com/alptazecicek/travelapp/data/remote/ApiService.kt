package com.alptazecicek.travelapp.data.remote

import com.alptazecicek.travelapp.domain.model.home.DealsModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("AllTravelList")
    fun getAllTravelList() : Call<DealsModel>
}