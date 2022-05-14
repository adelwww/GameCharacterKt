package com.example.gamecharacterkt.presentation.base

import androidx.recyclerview.widget.DiffUtil

abstract class IBaseDiffModel (value: Any){
    val value = value

    override fun equals(other: Any?): Boolean{
        return super.equals(other)
    }
}
class BaseDiffUtilItemCallback<T : IBaseDiffModel> : DiffUtil.ItemCallback<T>() {

    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem.value == newItem.value
    }

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem == newItem
    }

}