package com.akirachix.myfibonancy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Fibo(var number: List<Int>):RecyclerView.Adapter<NumberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val numberView = LayoutInflater.from(parent.context)
            .inflate(R.layout.sequence,parent,false)
        return NumberViewHolder(numberView)
    }


    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.rvNumbers.text = number[position].toString()

    }
    override fun getItemCount(): Int {
        return number.size

    }



}



class NumberViewHolder(numberView:View) :RecyclerView.ViewHolder(numberView){
    val rvNumbers = numberView.findViewById<TextView>(R.id.rvNumbers)
}