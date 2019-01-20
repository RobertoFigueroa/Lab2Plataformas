package com.example.rober.restaurante
import android.app.Application


class MyMenuOrder:Application()  {
    companion object : MenuOrder {

        override val menuOrder: ArrayList<String> = ArrayList()

        override fun clear() {
            this.menuOrder.clear()
        }// Limpiar pedido
        override fun add(element: String) {
            this.menuOrder.add(element)
        }// Agregar elemento
        override fun del(elementIndex: Int) {
            this.menuOrder[elementIndex].drop(elementIndex)
        }// Elimina elemento
        override fun done(){
            TODO("not implemented")
        } // Realiza pedido
    }


}