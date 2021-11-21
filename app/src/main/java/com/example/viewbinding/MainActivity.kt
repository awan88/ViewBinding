package com.example.viewbinding


import android.view.LayoutInflater
import com.example.viewbinding.databinding.ActivityMainBinding
import com.example.viewbinding.di.BaseActivity

class MainActivity (
    override val bindingInflater: (LayoutInflater) ->
    ActivityMainBinding = ActivityMainBinding::inflate) : BaseActivity<ActivityMainBinding>() {

    override fun initView() {
        binding.tvMain.text = "Hy"
    }

}