package com.afzaln.materialwe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ColorAdapter : RecyclerView.Adapter<ColorAdapter.ColorHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ColorHolder(inflater.inflate(R.layout.color_row_item, parent, false))
    }

    override fun onBindViewHolder(holder: ColorHolder, position: Int) {
        val colorResId = if (position >= accentColorList.size) {
            neutralColorList[position - accentColorList.size]
        } else {
            accentColorList[position]
        }
        holder.bind(colorResId)
    }

    override fun getItemCount(): Int = accentColorList.size + neutralColorList.size

    class ColorHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(colorResId: Int) {
            itemView.setBackgroundColor(itemView.resources.getColor(colorResId))
        }
    }

    companion object {
        val accentColorList = listOf(
            android.R.color.system_accent1_0,
            android.R.color.system_accent1_10,
            android.R.color.system_accent1_50,
            android.R.color.system_accent1_100,
            android.R.color.system_accent1_200,
            android.R.color.system_accent1_300,
            android.R.color.system_accent1_400,
            android.R.color.system_accent1_500,
            android.R.color.system_accent1_600,
            android.R.color.system_accent1_700,
            android.R.color.system_accent1_800,
            android.R.color.system_accent1_900,
            android.R.color.system_accent1_1000,
        )

        val neutralColorList = listOf(
            android.R.color.system_neutral1_0,
            android.R.color.system_neutral1_10,
            android.R.color.system_neutral1_50,
            android.R.color.system_neutral1_100,
            android.R.color.system_neutral1_200,
            android.R.color.system_neutral1_300,
            android.R.color.system_neutral1_400,
            android.R.color.system_neutral1_500,
            android.R.color.system_neutral1_600,
            android.R.color.system_neutral1_700,
            android.R.color.system_neutral1_800,
            android.R.color.system_neutral1_900,
            android.R.color.system_neutral1_1000,
        )
    }
}
