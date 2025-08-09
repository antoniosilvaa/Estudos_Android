package Estudo_kotlin

fun main() {
    val readOnlyshapes = listOf<String>("triangulo", "quadrado", "circulo")
    println("O primeiro item da lista é: ${readOnlyshapes.first()}")
    println("O segundo item da lista é: ${readOnlyshapes[1]}")
    println("O terceiro item da lista é: ${readOnlyshapes.last()}")

    println("------------------")

    println("Essa lista tem ${readOnlyshapes.count()} itens")

    val shapes: MutableList<String> = mutableListOf("triangulo", "quadrado", "circulo")

    shapes.add("pentagono")
    println(shapes)

    shapes.remove("pentagono")
    println(shapes)
}