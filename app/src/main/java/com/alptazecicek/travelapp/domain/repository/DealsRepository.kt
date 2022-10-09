package com.alptazecicek.travelapp.domain.repository

import com.alptazecicek.travelapp.domain.model.home.DealsModel
import retrofit2.Call

interface DealsRepository {

    fun getDeals() : Call<List<DealsModel>>

}