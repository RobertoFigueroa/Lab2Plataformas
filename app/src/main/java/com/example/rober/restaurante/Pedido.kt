package com.example.rober.restaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.activity_pedido.*

class Pedido : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        val factura = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, MyMenuOrder.menuOrder) //se encarga de
        listaOrden.adapter = factura

        listaOrden.setOnItemLongClickListener { parent, view, position, id ->
            Toast.makeText(this,"Se eliminio ${MyMenuOrder.menuOrder[position]}",Toast.LENGTH_SHORT).show()
            MyMenuOrder.del(position)
            factura.notifyDataSetChanged()
            return@setOnItemLongClickListener true

        }

        limpiarPedido.setOnClickListener {
            MyMenuOrder.menuOrder.clear()
            factura.notifyDataSetChanged()
            Toast.makeText(this, "Se limpio el pedido",Toast.LENGTH_SHORT).show()
        }
        hacerPedido.setOnClickListener {
            MyMenuOrder.menuOrder.clear()
            factura.notifyDataSetChanged()
            Toast.makeText(this, "Se realizo el pedido exitosamente",Toast.LENGTH_SHORT).show()
        }


    }
    fun irmenu(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }



}
