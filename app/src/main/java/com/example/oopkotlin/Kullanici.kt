package com.example.oopkotlin

class Kullanici {

    var isim: String? = null
    var yas: Int? = null

    constructor(isim: String, yas: Int){
        this.isim = isim
        this.yas= yas

        println("constructor cagrildi")

    }

    init {
        println("init cagrildi")
    }
}