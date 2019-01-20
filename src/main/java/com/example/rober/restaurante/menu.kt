package com.example.rober.restaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_menu.*




    class menu :  AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val products = ArrayAdapter<String>(this, R.layout.activity_menu, MyMenuOrder.menuOrder) //se encarga de
        lista.adapter = products


    }
    fun irmenu(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
