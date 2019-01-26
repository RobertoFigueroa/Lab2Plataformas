package com.example.rober.restaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_menu.*




    class MenuActivity :  AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        val dummyList = listOf("Tamal","Chucho","Ponche", "Tostada","Chirmol")

        val products = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dummyList) //se encarga de
        lista.adapter = products


        lista.setOnItemClickListener { parent, view, position, id ->
            MyMenuOrder.add(dummyList[position])
            Toast.makeText(this,"Se agrego ${dummyList[position]}",Toast.LENGTH_LONG).show()
        }


    }
    fun irmenu(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
