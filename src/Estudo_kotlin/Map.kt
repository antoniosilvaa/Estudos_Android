package Estudo_kotlin

fun main(){
    val readOnlyJuiceMenu = mapOf("Maçã" to 100, "Banana" to 150, "Kiwi" to 200)
    println(readOnlyJuiceMenu)


    println("------------------")

    val Juicemenu: MutableMap<String, Int> = mutableMapOf("Kiwi" to 100, "Maçã" to 150, "Banana" to 200)
    println(Juicemenu)

}