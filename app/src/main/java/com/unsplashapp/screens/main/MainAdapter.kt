package com.unsplashapp.screens.main

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.domain.entities.model.ModelApp
import com.unsplashapp.databinding.ItemAdapterBinding
import kotlinx.coroutines.*
import java.io.IOException
import java.net.URL

class MainAdapter : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    private val modelApp = mutableListOf<ModelApp>()

    fun addList(repo: List<ModelApp>) {
        modelApp.clear()
        modelApp.addAll(repo)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MainViewHolder(
        ItemAdapterBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun getItemCount(): Int = modelApp.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(
            modelApp[position]
        )
    }

    class MainViewHolder(
        private val binding: ItemAdapterBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(
            modelApp: ModelApp
        ) {
            val urlImage1 = URL("${modelApp.picture1}")
            val urlImage2 = URL("${modelApp.picture2}")
            val urlImage3 = URL("${modelApp.picture3}")
            val urlImage4 = URL("${modelApp.picture4}")

            val result1: Deferred<Bitmap?> = GlobalScope.async {
                urlImage1.toBitmap()
            }
            val result2: Deferred<Bitmap?> = GlobalScope.async {
                urlImage2.toBitmap()
            }
            val result3: Deferred<Bitmap?> = GlobalScope.async {
                urlImage3.toBitmap()
            }
            val result4: Deferred<Bitmap?> = GlobalScope.async {
                urlImage4.toBitmap()
            }

            GlobalScope.launch(Dispatchers.Main) {
                binding.picture1.setImageBitmap(result1.await())
                binding.picture2.setImageBitmap(result2.await())
                binding.picture3.setImageBitmap(result3.await())
                binding.picture4.setImageBitmap(result4.await())
            }
        }

        private fun URL.toBitmap(): Bitmap? {
            return try {
                BitmapFactory.decodeStream(openStream())
            } catch (e:IOException) {
                null
            }
        }
    }
}