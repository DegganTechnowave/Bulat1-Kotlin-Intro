package com.deggan.bulatpert1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intentFromPreviousActivity = intent.getStringExtra("intentExtraString")
        textView.text = intentFromPreviousActivity
    }
}
