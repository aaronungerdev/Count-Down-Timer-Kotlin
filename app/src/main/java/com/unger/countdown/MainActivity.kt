package com.unger.countdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.unger.countdown.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        object : CountDownTimer(10000,100){
            override fun onTick(p0: Long) {
                binding.textView.text = " Left: ${p0/1000}  "
            }

            override fun onFinish() {
                binding.textView.text= "Time Over!"
            }

        }.start()

    }


}