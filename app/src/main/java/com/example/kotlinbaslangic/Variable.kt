package com.example.kotlinbaslangic

import kotlin.reflect.typeOf

class Variable {
    init {
        var name = "mustafa UYAR"

        //explicit
        var x:Long = 7 // burdaki x ile diger x farkli katmdanlar


//        tamsayi()

//        floating()

//        string()

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
        var z:UInt = 5u//negatif degerler olmaz
        println(z)

    }
    private fun string(){
        val name = "mustafa"
        val surname = "uyar"
        println(name.uppercase())
        println(name)
        println(name + surname.uppercase())

        val age = "28"
        val year = "2024"
        println(age + year)

        val benimStr:String
        benimStr = "initialize" // initialize,init,initialization,baslatma
        println(benimStr)

        //Conversion

        println(year.toInt() - age.toInt())


    }
    fun boolean(){
        println("ders 3_8")

        fun x(): Int{
            println("x")
            return 5
        }

        fun y(): Int{
            println("y")
            return 2
        }

        fun z(): Int{
            println("z")
            return 10
        }
        // julia da ki kisa devre mantigi gibi
        //Short-circuit evaluation
        println(x()<y() && x()>z()) // kısa devre var ilk kosul yanlis ise digerlerine bakilmiyor && ve de
        println(x()>y() || x()>z()) // kısa devre var ilk kosul yanlis ise digerlerine bakilmiyor && ve de

    }
    fun data_structures_arrays(){
        val liste = arrayOf("mustafa","uyar","ahmet","mehmet","veli") // index 0 dan baslar julia 1 da baslar
        println(liste[0])
        println(liste[1])
        println(liste.get(4))

        val liste2 = arrayOf(1,2,3,4,5.5,"mustafa",true) //farkli veri tiplerinde olabilir

        println(liste2.sliceArray(2..5)) // pythonda ki liste2[2:5] gibi
        println(liste2.sliceArray(2..5).contentToString())

    // arrayler degistirelibilir ama yeni eleman eklenemiyor
    }

    fun data_structures_lists(){
        val liste = ArrayList<Int>()
        liste.add(28)
        liste.add(30)
        println(liste[0])
        val liste2 = arrayListOf<Any>()
        liste2.add("mustafa")
        liste2.add(true)
        liste2.add(-5.2f)
        liste2.add(8u)
        println(liste2)
    }
}
fun main(){
    val variable = Variable()
//    variable.boolean()
//    variable.data_structures_arrays()
    variable.data_structures_lists()
}