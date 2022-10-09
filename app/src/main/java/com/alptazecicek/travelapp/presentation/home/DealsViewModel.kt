package com.alptazecicek.travelapp.presentation.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.alptazecicek.travelapp.domain.model.home.DealsModel
import com.alptazecicek.travelapp.domain.usecase.DealsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DealsViewModel @Inject constructor(
    private val dealsUseCase: DealsUseCase
): ViewModel() {

    fun getDeals(): LiveData<List<DealsModel>>{
        dealsUseCase.apply {
            getDeals()
            return deals
        }
    }
}