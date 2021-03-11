package com.fyndev.moto.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.fyndev.moto.data.Motor
import com.fyndev.moto.databinding.ItemMotorBinding
import com.fyndev.moto.detail.DetailActivity
import java.util.*
import kotlin.collections.ArrayList

class MotorAdapter(listMotor: ArrayList<Motor>) : RecyclerView.Adapter<MotorAdapter.ViewHolder>(), Filterable {

    private val searchList = ArrayList<Motor>(listMotor)
    private val mainList = listMotor

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
                ItemMotorBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mainList[position])
    }

    override fun getItemCount(): Int = mainList.size

    class ViewHolder(private val binding: ItemMotorBinding) :
            RecyclerView.ViewHolder(binding.root) {
        fun bind(motor: Motor) {
            binding.tvName.text = motor.name
            binding.tvPrice.text = motor.price
            binding.imgPoster.load(motor.poster) {
                crossfade(true)
                crossfade(1000)
            }

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailActivity::class.java).apply {
                    putExtra(DetailActivity.EXTRA_DETAIL, motor)
                }
                it.context.startActivity(intent)
            }
        }
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence): FilterResults {
                val filteredList = ArrayList<Motor>()
                if (constraint.isBlank() or constraint.isEmpty()) {
                    filteredList.addAll(searchList)
                } else {
                    val filterPattern = constraint.toString().toLowerCase(Locale.ROOT).trim()

                    searchList.forEach {
                        if (it.name.toLowerCase(Locale.ROOT).contains(filterPattern)) {
                            filteredList.add(it)
                        }
                    }
                }
                val result = FilterResults()
                result.values = filteredList

                return result
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                mainList.clear()
                mainList.addAll(results?.values as List<Motor>)
                notifyDataSetChanged()
            }
        }
    }
}