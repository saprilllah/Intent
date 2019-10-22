package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var nimmhs: EditText = findViewById(R.id.nim)
        var namamhs: EditText = findViewById(R.id.nama)
        var nilaimhs: EditText = findViewById(R.id.nilai)


        btn_proses.setOnClickListener{

            intent = Intent(this, Activity_2::class.java)
            intent.putExtra("nim",nimmhs.getText())
            intent.putExtra("nama",namamhs.getText())
            intent.putExtra("nilai",nilaimhs.getText())

            startActivity(intent)
        }

    }
}