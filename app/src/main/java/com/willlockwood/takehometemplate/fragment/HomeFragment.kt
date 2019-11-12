package com.willlockwood.takehometemplate.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.willlockwood.takehometemplate.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initNavigationButtons()
    }

    private fun initNavigationButtons() {
        val navController = findNavController()
        pager_btn.setOnClickListener            { navController.navigate(R.id.action_homeFragment_to_viewPagerFragment) }
        state_pager_btn.setOnClickListener      { navController.navigate(R.id.action_homeFragment_to_viewStatePagerFragment) }
        recycler_btn.setOnClickListener         { navController.navigate(R.id.action_homeFragment_to_recyclerViewFragment) }
        swipe_recycler_btn.setOnClickListener   { navController.navigate(R.id.action_homeFragment_to_recyclerViewSwipeFragment) }
    }
}
