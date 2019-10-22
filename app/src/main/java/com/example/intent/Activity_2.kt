package com.example.intent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_2.*

class Activity_2 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val bundle= intent.extras
        val nim2 = bundle?.get("nim")
        val nama2 = bundle?.get("nama")
        val nilai2 = bundle?.get("nilai")
        var nilai = nilai2.toString()
        var nilaib = nilai.toInt()

        if (nilaib >= 80){
            keterangan.setText("A")
        }
        else if(nilaib >= 60){
            keterangan.setText("B")
        }
        else if(nilaib >= 40){
            keterangan.setText("C")
        }
        else if(nilaib >= 20){
            keterangan.setText("D")
        }
        else{
            keterangan.setText("E")
        }
        nimhasil.setText(""+nim2)
        namahasil.setText(""+nama2)
        nilaihasil.setText(""+nilai2)




    }

}