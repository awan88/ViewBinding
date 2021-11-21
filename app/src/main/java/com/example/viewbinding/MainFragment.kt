package com.example.viewbinding

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.viewbinding.databinding.ActivityMainBinding
import com.example.viewbinding.di.BaseFragment

/**
 * This class com.example.viewbinding
 * Created by Awan88 on 21/11/2021.
 */


class MainFragment (
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) ->
    ActivityMainBinding = ActivityMainBinding::inflate
) : BaseFragment<ActivityMainBinding>() {

    override fun initView() {

    }
}