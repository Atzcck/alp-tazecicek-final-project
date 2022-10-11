package com.alptazecicek.travelapp.presentation.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import com.alptazecicek.travelapp.BR
import android.view.ViewGroup
import androidx.appcompat.widget.LinearLayoutCompat.HORIZONTAL
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alptazecicek.travelapp.adapters.DealsAdapter
import com.alptazecicek.travelapp.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private lateinit var fragmentHomeBinding: FragmentHomeBinding
    private val dealsModel by viewModels<DealsViewModel>()
    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)
        return fragmentHomeBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        dealsModel.getDeals().observe(viewLifecycleOwner) {
            //fragmentHomeBinding.textView2.text = it.toString()
            //Log.v("PATIKA", it.toString())
            val adapter = DealsAdapter(it)
            fragmentHomeBinding.apply {
                dealsRecycler.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL , false)
                setVariable(BR.dealsAdapter,adapter)
            }
        }
    }
}