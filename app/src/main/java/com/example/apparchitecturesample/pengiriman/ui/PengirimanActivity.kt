package com.example.apparchitecturesample.pengiriman.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apparchitecturesample.databinding.ActivityPengirimanBinding
import com.example.apparchitecturesample.helper.AppController
import com.example.apparchitecturesample.helper.Status
import com.example.apparchitecturesample.pengiriman.viewmodel.PengirimanViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class PengirimanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPengirimanBinding
    private val viewModel: PengirimanViewModel by lazy {
        (application as AppController).appContainer.pengirimanViewModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPengirimanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fetchListCar()
    }

    private fun fetchListCar() {
        viewModel.fetchListCar().observe(this) { resource ->
            when (resource.status) {
                Status.LOADING -> {

                }

                Status.ERROR -> {

                }

                else -> {
                    val listCar = resource.data?.body
                    listCar?.let {
                        it.forEach { car ->
                            println(car.nomor)
                        }
                    }
                }
            }
        }
    }


    private fun synchronize() {
        val scopeIO = CoroutineScope(Dispatchers.IO) // do api exec process not in main thread
        scopeIO.launch {
            val result = viewModel.synchronizeExpedition("this_is_dummy_param")
            if (result.status == Status.ERROR) {
                runOnUiThread {
                    // do some UI operations here
                }
            } else if (result.status == Status.SUCCESS) {
                runOnUiThread {
                    // do some UI operations here
                }
            }
        }
    }
}