package com.kalbitzer.android_asignment_1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.WARN
import android.view.View
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun registerNumber(view: View){
        val numberText = findViewById<TextView>(R.id.numberView)
        numberText.text = numberText.text.toString() + view.getTag()
    }
    fun call(view:View){
        val numberToCall = findViewById<TextView>(R.id.numberView).text
        val callIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${numberToCall}"))
        startActivity(callIntent)
    }
    fun deleteLastNumber(view: View){
        val numberToCall = findViewById<TextView>(R.id.numberView)
        numberToCall.text = numberToCall.text.dropLast(1)
    }

}