package com.example.kotlinbaslangic

import kotlin.reflect.typeOf

class Variable {
    init {
        var name = "mustafa UYAR"
        tamsayi()

        //explicit
        var x:Long = 7 // burdaki x ile diger x farkli katmdanlar

        floating()


    }
    private fun tamsayi(){
        println("tam sayi")


        //implicit
        var x = 5

    }
    private fun floating(){
        var x = 5.5f //f koyunca float olur
        var y = 5.5 //double olur
        println("$x ${x::class}")
        println(y)

    }

}
fun main(){
   Variable()
}