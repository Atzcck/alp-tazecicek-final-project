package com.alptazecicek.travelapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.alptazecicek.travelapp.R
import com.alptazecicek.travelapp.domain.model.home.DealsModel
import com.alptazecicek.travelapp.presentation.home.DealsViewHolder

class DealsAdapter(
    private val dealsList: List<DealsModel>,
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val dealsBinding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context), R.layout.deals_recycler_item, parent, false
        )
        return DealsViewHolder(dealsBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as DealsViewHolder).onBind(dealsList[position])
    }

    override fun getItemCount(): Int {
        return dealsList.size
    }

}