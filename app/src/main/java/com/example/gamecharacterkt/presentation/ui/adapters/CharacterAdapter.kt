package com.example.gamecharacterkt.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.gamecharacterkt.databinding.ItemCharacterBinding
import com.example.gamecharacterkt.presentation.base.BaseDiffUtilItemCallback
import com.example.gamecharacterkt.presentation.ui.modelsui.CharacterModelUI

class CharacterAdapter: ListAdapter<CharacterModelUI, CharacterAdapter.CharacterViewHolder>(
    BaseDiffUtilItemCallback()
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        return CharacterViewHolder(
            ItemCharacterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false))
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class CharacterViewHolder(
        private val binding: ItemCharacterBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: CharacterModelUI) = with(binding) {
            tvName.text = model.name
            Glide.with(characterIm).load(model.image).into(characterIm)
        }
    }

}