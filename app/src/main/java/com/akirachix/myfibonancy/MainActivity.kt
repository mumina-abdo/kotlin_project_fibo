package com.akirachix.myfibonancy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.myfibonancy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val FiboResults = FiboNum(100)
        binding.rvNames.layoutManager = LinearLayoutManager(this)
        val numAdapter = Fibo(FiboResults)
        binding.rvNames.adapter = numAdapter


        }
    fun FiboNum(num:Int):List<Int>{
        val numbers = mutableListOf(0,1)
        while (numbers.size<num){
            numbers.add(numbers[numbers.lastIndex]+ numbers[numbers.lastIndex-1])
        }
        return numbers
    }
    }
