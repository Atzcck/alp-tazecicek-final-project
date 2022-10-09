package com.alptazecicek.travelapp.data.remote.repository

import com.alptazecicek.travelapp.data.remote.ApiService
import com.alptazecicek.travelapp.domain.model.home.DealsModel
import com.alptazecicek.travelapp.domain.repository.DealsRepository
import retrofit2.Call

class DealsRepositoryImp(private val apiService: ApiService): DealsRepository {

    override fun getDeals(): Call<List<DealsModel>> {
        return apiService.getAllTravelList()
    }
}