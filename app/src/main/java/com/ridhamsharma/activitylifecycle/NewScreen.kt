package com.ridhamsharma.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NewScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_screen)
    }

}