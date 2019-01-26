package com.example.rober.restaurante

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


}

    fun irMenu(view: View) {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }

    fun irPedido(view: View) {
        val intent = Intent(this, Pedido::class.java)
        startActivity(intent)
    }
}
