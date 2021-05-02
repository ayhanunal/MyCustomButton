package com.ayhanunal.mycustombutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var switched : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initButtons();
    }


   fun initButtons(){
        btnRed.setIsRed(true)
       btnRed.setIsRed(false)

       btnSwitch.setOnClickListener{
           btnRed.setIsRed(switched);
           btnGreen.setIsRed(!switched);

           switched = !switched;
       }
   }



}