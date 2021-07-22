package com.afzaln.materialwe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ColorAdapter : RecyclerView.Adapter<ColorAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater = LayoutInflater.from(parent.context)
        return if (viewType == HEADER) {
            Holder.HeaderHolder(inflater.inflate(R.layout.header_row_item, parent, false))
        } else {
            Holder.ColorHolder(inflater.inflate(R.layout.color_row_item, parent, false))
        }
    }

    override fun onBindViewHolder(holder: Holder, position: Int) =
        when (holder) {
            is Holder.HeaderHolder -> holder.bind(listItems[position] as String)
            is Holder.ColorHolder -> holder.bind(listItems[position] as List<Int>)
        }

    override fun getItemCount(): Int = listItems.size

    override fun getItemViewType(position: Int): Int =
        if (listItems[position] is String) HEADER else COLOR

    sealed class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        class ColorHolder(itemView: View) : Holder(itemView) {
            private val colorViews = listOf<View>(
                itemView.findViewById(R.id.color_0),
                itemView.findViewById(R.id.color_1),
                itemView.findViewById(R.id.color_2),
                itemView.findViewById(R.id.color_3),
                itemView.findViewById(R.id.color_4),
                itemView.findViewById(R.id.color_5),
                itemView.findViewById(R.id.color_6),
                itemView.findViewById(R.id.color_7),
                itemView.findViewById(R.id.color_8),
                itemView.findViewById(R.id.color_9),
                itemView.findViewById(R.id.color_10),
                itemView.findViewById(R.id.color_11),
                itemView.findViewById(R.id.color_12)
            )

            fun bind(colorIds: List<Int>) {
                colorViews.forEachIndexed { index, view ->
                    view.setBackgroundColor(itemView.resources.getColor(colorIds[index]))
                }
            }
        }

        class HeaderHolder(itemView: View) : Holder(itemView) {
            private val header = itemView.findViewById<TextView>(R.id.header)

            fun bind(title: String) {
                header.text = title
            }
        }
    }

    companion object {
        private const val HEADER = 0
        private const val COLOR = 1

        private val accentColorList1 = listOf(
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

        private val accentColorList2 = listOf(
            android.R.color.system_accent2_0,
            android.R.color.system_accent2_10,
            android.R.color.system_accent2_50,
            android.R.color.system_accent2_100,
            android.R.color.system_accent2_200,
            android.R.color.system_accent2_300,
            android.R.color.system_accent2_400,
            android.R.color.system_accent2_500,
            android.R.color.system_accent2_600,
            android.R.color.system_accent2_700,
            android.R.color.system_accent2_800,
            android.R.color.system_accent2_900,
            android.R.color.system_accent2_1000,
        )

        private val accentColorList3 = listOf(
            android.R.color.system_accent3_0,
            android.R.color.system_accent3_10,
            android.R.color.system_accent3_50,
            android.R.color.system_accent3_100,
            android.R.color.system_accent3_200,
            android.R.color.system_accent3_300,
            android.R.color.system_accent3_400,
            android.R.color.system_accent3_500,
            android.R.color.system_accent3_600,
            android.R.color.system_accent3_700,
            android.R.color.system_accent3_800,
            android.R.color.system_accent3_900,
            android.R.color.system_accent3_1000,
        )

        private val neutralColorList1 = listOf(
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

        private val neutralColorList2 = listOf(
            android.R.color.system_neutral2_0,
            android.R.color.system_neutral2_10,
            android.R.color.system_neutral2_50,
            android.R.color.system_neutral2_100,
            android.R.color.system_neutral2_200,
            android.R.color.system_neutral2_300,
            android.R.color.system_neutral2_400,
            android.R.color.system_neutral2_500,
            android.R.color.system_neutral2_600,
            android.R.color.system_neutral2_700,
            android.R.color.system_neutral2_800,
            android.R.color.system_neutral2_900,
            android.R.color.system_neutral2_1000,
        )

        @OptIn(ExperimentalStdlibApi::class)
        val listItems = buildList {
            add("Accent Color 1")
            add(accentColorList1)
            add("Accent Color 2")
            add(accentColorList2)
            add("Accent Color 3")
            add(accentColorList3)
            add("Neutral Color 1")
            add(neutralColorList1)
            add("Neutral Color 2")
            add(neutralColorList2)
        }
    }
}
