package Estudo_kotlin

fun main(){
    val readOnlyfruit = setOf("maça", "Banana", "cereja", "cereja")
    println(readOnlyfruit)

    val fruit: MutableSet<String> = mutableSetOf("Maçã", "Banana", "Cereja")
    println(fruit)
}