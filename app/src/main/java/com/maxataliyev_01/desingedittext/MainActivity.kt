package com.maxataliyev_01.desingedittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doOnTextChanged
import com.maxataliyev_01.desingedittext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.etPhone.doOnTextChanged { text, start, before, count ->
            if (text!!.length>10){
                binding.textInputLayout.error="No More!"
            }else if(text.length<10){
                binding.textInputLayout.error=null
            }
        }

    }
}