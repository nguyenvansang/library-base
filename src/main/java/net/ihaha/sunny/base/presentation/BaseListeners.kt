package net.ihaha.sunny.base.presentation

import android.widget.TextView
import com.google.android.material.tabs.TabLayout

interface TabSelectListener : TabLayout.OnTabSelectedListener {
    override fun onTabReselected(tab: TabLayout.Tab) = Unit
    override fun onTabUnselected(tab: TabLayout.Tab) = Unit
}

interface EditorActionListener : TextView.OnEditorActionListener