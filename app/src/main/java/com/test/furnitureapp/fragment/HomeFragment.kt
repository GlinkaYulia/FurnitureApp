package com.test.furnitureapp.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.test.furnitureapp.R
import com.test.furnitureapp.adapter.BannerItem
import com.test.furnitureapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)

        val banners = listOf(
            BannerItem("Focus on sofas!", "Up to 30% off..."),
            BannerItem("New Chairs", "Comfort for you"),
            BannerItem("Lighting Sale", "Brighten up your room")
        )

        val bannerAdapter = BannerItem.BannerAdapter(banners)
        binding.bannerViewPager.adapter = bannerAdapter

        com.google.android.material.tabs.TabLayoutMediator(binding.tabIndicator, binding.bannerViewPager) { tab, position ->
        }.attach()
    }


}