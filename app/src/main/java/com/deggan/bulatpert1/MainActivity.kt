package com.deggan.bulatpert1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonClick.setOnClickListener {
            val editTextValue = editText.text.toString()
            if (editTextValue.isNotEmpty()){
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("intentExtraString",editTextValue)
                startActivity(intent)
            }else{
                Toast.makeText(this,"KOSONG, KOSONG", Toast.LENGTH_LONG).show()
            }
        }
    }

}
