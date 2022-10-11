package com.alptazecicek.travelapp.domain.usecase

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.alptazecicek.travelapp.adapters.DealsAdapter
import com.alptazecicek.travelapp.domain.model.home.DealsModel
import com.alptazecicek.travelapp.domain.repository.DealsRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class DealsUseCase @Inject constructor(
    private val dealsRepository: DealsRepository
) {
    private var _deals = MutableLiveData<List<DealsModel>>()
    val deals: LiveData<List<DealsModel>> = _deals

    fun getDeals() {
        dealsRepository.getDeals().enqueue(object: Callback<List<DealsModel>>{
            override fun onResponse(call: Call<List<DealsModel>>, response: Response<List<DealsModel>>) {
                _deals.value = response.body()

            }

            override fun onFailure(call: Call<List<DealsModel>>, t: Throwable) {
                Log.v("Alp",t.message.toString())
            }
        })
    }
}