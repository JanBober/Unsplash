package com.unsplashapp.screens.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.unsplashapp.R
import com.unsplashapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var mainActivityViewModel: MainActivityViewModel
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(
            this,
            R.layout.activity_main
        )
            .also {
                it.lifecycleOwner = this
                it.viewModel = mainActivityViewModel
            }
        mainAdapter = MainAdapter()
        binding.recyclerView.adapter = mainAdapter
        mainActivityViewModel.fetchUnSplashApi()
        mainActivityViewModel.action.observe(this) {
            when(it) {
                is MainActivityViewModel.Action.DownloadData -> {
                    mainAdapter.addList(it.modelApp)
                }
            }
        }
    }
}