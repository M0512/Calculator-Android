package com.example.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.constraintlayout.databinding.ActivityMainBinding


private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnApply.setOnClickListener {
            val firstName= binding.etfirstName.text.toString()
            val secondName=binding.etlastName.text.toString()
            val birthDate= binding.etbirthDate.text.toString()
            val country= binding.etcountry.text.toString()
binding.tedisplay.setText("Hie your name is "+firstName+" "+secondName+" you were born on "+birthDate+" and you are curently a resident of "+country)

        }







    }
}