/** Created by MiguelRomeral */

/** Siguiendo los pasos de Ion Jaureguialzo Sarasola */

fun main(args: Array<String>) {
    println("Hello, World!")

    // Asignación de variables de solo lectura
    val a: Int = 1
    val b = 2 // Inferencia de tipos: el comilador deduce que será Int
    val c: Int
    c = 3

    // Variables mutables
    var x = 5
    x += 1

    val hora = 9
    println("Son las ${hora} en punto.")

    /*
        TIPOS DE DATOS
       (Tipo, Bits, Descripción)
        Int - 32 - entero
        Long - 64 - entero largo
        Float - 32 - precisión
        Double - 64 - precisión doble
        Short - 16 - entero corto
        Byte - 8 - Byte
     */
    val decimal = 1_000_000
    val entero = 1
    val largo = 123L
    val binario = 0b1011_1100
    val hexadecimal = 0xF3A
    val doble = 1.25e4
    val flotante = 123.5f
    val buleano: Boolean = true

    // Conversiones explícitas únicamente
    val b: Byte = 1
    //ERROR: val i: Int = b
    val i: Int = b.toInt()


}