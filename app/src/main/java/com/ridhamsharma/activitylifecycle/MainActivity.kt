package com.ridhamsharma.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    var btnMove: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMove = findViewById(R.id.btnMove)

        btnMove?.setOnClickListener {
            var intent =
                Intent(this, NewScreen::class.java)  //ticket to go to next screen
            startActivity(intent)  // take to next screen
            //finish() // take out of app after seeing 2nd page ...when you exit
        }
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"On Start method invoked", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"on Pause method invoked", Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"on Resume method invoked", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"on Stop method invoked", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"on Destroy method invoked", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"on Restart method invoked", Toast.LENGTH_SHORT)
    }

    }