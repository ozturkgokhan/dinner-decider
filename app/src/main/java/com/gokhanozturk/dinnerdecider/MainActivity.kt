package com.gokhanozturk.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese","Mc Donald's","Burger King","Pizza Hut","Quizno's Sub")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            val random = Random()
            val randomFoodIndex = random.nextInt(foodList.count())

            selectedFoodTxt.text = foodList[randomFoodIndex]
        }

        addFoodBtn.setOnClickListener {
            if (addFoodTxt.text.toString() != "") {
                foodList.add(addFoodTxt.text.toString())
                addFoodTxt.text.clear()
                println(foodList)
            }
        }
    }
}
