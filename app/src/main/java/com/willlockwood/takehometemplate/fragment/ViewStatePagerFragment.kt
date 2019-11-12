package com.willlockwood.takehometemplate.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.ViewPager
import com.willlockwood.takehometemplate.R
import com.willlockwood.takehometemplate.adapter.LockwoodStatePagerAdapter
import com.willlockwood.takehometemplate.viewmodel.LockwoodVM
import kotlinx.android.synthetic.main.fragment_view_pager.view_pager
import kotlinx.android.synthetic.main.fragment_view_state_pager.*

class ViewStatePagerFragment : Fragment() {

    private lateinit var lockwoodVM: LockwoodVM
    private lateinit var viewPager: ViewPager
    private lateinit var lockwoodStatePagerAdapter: LockwoodStatePagerAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_view_state_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewModels()

        setUpViewPager()
    }

    private fun setUpViewPager() {
        viewPager = view_pager
        lockwoodStatePagerAdapter = LockwoodStatePagerAdapter(
            listOf("first", "second", "third", "fourth"),
            childFragmentManager
        )
        viewPager.adapter = lockwoodStatePagerAdapter
        state_pager_tabs.setupWithViewPager(viewPager)
    }

    private fun setUpViewModels() {
        lockwoodVM = ViewModelProviders.of(this).get(LockwoodVM::class.java)
    }
}
