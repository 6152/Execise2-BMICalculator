package com.example.execise2_bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.VisibleForTesting
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fun calculateBMI(height: Double, weight: Double): Double {
            return weight / (height * height)}

        setContentView(R.layout.activity_main)
            buttonCal.setOnClickListener() {
                val height: Double = editText.toString().toDouble()
                val weight: Double = editText2.toString().toDouble()


                val bmi: Double = calculateBMI(height, weight)
                val status: String



                if (bmi > 25) {
                    imageView.setImageResource(R.drawable.over)
                    status = "Over"
                } else if (bmi <= 18.5) {
                            imageView.setImageResource(R.drawable.under)
                    status = "Under"
                } else {
                     imageView.setImageResource(R.drawable.normal)
                    status = "Normail"
                }
               textView4.text = "BMI : %.2f (%s)".format(bmi,status)

            }
        btnReset.setOnClickListener(){
            imageView.setImageResource(R.drawable.empty)

            textView4.text = null
            editText.text=null
            editText2.text = null

            editText.requestFocus()
        }



        }
    }
