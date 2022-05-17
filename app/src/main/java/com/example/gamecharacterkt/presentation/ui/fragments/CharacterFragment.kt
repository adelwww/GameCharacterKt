package com.example.gamecharacterkt.presentation.ui.fragments

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.gamecharacterkt.R
import com.example.gamecharacterkt.databinding.FragmentCharacterBinding
import com.example.gamecharacterkt.presentation.base.BaseFragment
import com.example.gamecharacterkt.presentation.ui.adapters.CharacterAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CharacterFragment : BaseFragment<CharacterViewModel, FragmentCharacterBinding>(
    R.layout.fragment_character
) {
    override val viewModel: CharacterViewModel by viewModels()
    override val binding by viewBinding(FragmentCharacterBinding::bind)
    private val characterAdapter = CharacterAdapter()

    override fun initialize() {
        setupAdapter()
    }

    private fun setupAdapter() = with(binding.recyclerCharacter) {
        val linerLayoutManager = LinearLayoutManager(context)
        layoutManager = linerLayoutManager
        adapter = characterAdapter
    }

    override fun setupSubscribe() {
        viewModel.characterState.collectUIState(
            error = {
                Log.e("anime", it)
            },
            success = {
                characterAdapter.submitList(it)
                Log.e("son", it.toString())
            })
    }

}