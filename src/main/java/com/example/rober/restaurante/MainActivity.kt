package com.example.rober.restaurante

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.EditText




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


}

    fun irMenu(view: View) {
        val intent = Intent(this, menu::class.java)
        startActivity(intent)
    }

    fun irPedido(view: View) {
        val intent = Intent(this, Pedido::class.java)
        startActivity(intent)
    }
}
