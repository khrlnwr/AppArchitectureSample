package com.example.apparchitecturesample.pengiriman.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apparchitecturesample.databinding.ActivityPengirimanBinding
import com.example.apparchitecturesample.helper.AppController
import com.example.apparchitecturesample.pengiriman.viewmodel.PengirimanViewModel

class PengirimanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPengirimanBinding
    private val viewModel: PengirimanViewModel by lazy {
        (application as AppController).appContainer.pengirimanViewModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPengirimanBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}