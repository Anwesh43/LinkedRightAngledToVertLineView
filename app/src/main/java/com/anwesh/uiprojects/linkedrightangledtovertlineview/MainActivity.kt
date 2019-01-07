package com.anwesh.uiprojects.linkedrightangledtovertlineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.rightangletovertlineview.RightAngledToVertLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        RightAngledToVertLineView.create(this)
    }
}
