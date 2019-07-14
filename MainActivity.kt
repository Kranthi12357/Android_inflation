package com.example.toast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var happybutton = findViewById<Button>(R.id.happy)
        happybutton.setOnClickListener {
            var tet:TextView = findViewById(R.id.name)
           var string =  tet.text.toString()
            pressed(string)
        }
    }
    fun pressed(string:String):Unit{
        var inflater:LayoutInflater = layoutInflater
        var layout:View = inflater.inflate(R.layout.toast,null)

        var t:TextView = layout.findViewById(R.id.toast)
        t.text = string

        var toast :Toast = Toast((applicationContext))
        toast.setGravity(Gravity.CENTER,0,5)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = layout
        toast.show()


    }
}
