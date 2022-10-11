package com.alptazecicek.travelapp.presentation.home

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.alptazecicek.travelapp.BR
import com.alptazecicek.travelapp.databinding.DealsRecyclerItemBinding
import com.alptazecicek.travelapp.domain.model.home.DealsModel

class DealsViewHolder(
    val dealsBinding: ViewDataBinding
): RecyclerView.ViewHolder(dealsBinding.root) {

    fun onBind(dealsModel: DealsModel) {
        val binding = dealsBinding as DealsRecyclerItemBinding

        binding.setVariable(BR.dealsModel, dealsModel)
    }
}