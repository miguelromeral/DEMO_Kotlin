import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException
import javax.xml.bind.DatatypeConverter

fun estructuras(){

    // IF

    var c1 = true
    var c2 = false

    var i1 = 5
    var i2 = 2

    if(c1)
        println("True")


    if(c2){
        println("True")
    }else{
        println("False")
    }

    // Se puede usar if para asignar si se usa un else
    val max = if(i1 > i2) i1 else i2

    val max2 = if(i1 > i2){
        println("Choose i1")
        i1
    }else{
        println("Choose i2")
        i2
    }



    // WHEN --> switch

    val n = 30
    val valid = 25..29

    when (i1){
        1 -> println("Uno")
        2 -> println("Dos")
        3 -> println("Tres")
        4 -> {
            println("Cuatro")
            println("Four")
        }
        5,6 -> println("Cinco o seis")
        in 10..20 -> println("Entre 10 y 20)")
        in valid -> println("En rango")
        !in 10..20 -> println("no entre 10 y 20")
        n -> println("Es n")
        else -> println("Nada...")
    }
    // También puede usarse como sentencia o expresión (con else)

    // Evaluacion de tipos:
    when(i1){
        is Int -> println("Es string")
        else -> println("no es string")
    }



    // OPERADORES RELACIONALES Y LÓGICOS

    // Operadores relacionales
    var res = 5 == 4
    res = 5 != 4
    res = 5 > 4
    res = 5 < 4
    res = 5 >= 4
    res = 5 <= 4
    res = 5 === 4 // Idéntico (referencial)
    res = 5 !== 4 // No idéntico

    // Operadores lógicos
    res = !false
    res = true && false
    res = true || false



    // ESTRUCTURAS REPETITIVAS

    var x = 5

    while(x > 0){
        x--
    }


    do{
        x++
    }while(x < 5)
    // Desde la condicion del do-while, tenemos acceso a la variable declarada dentro


    // De colecciones
    val ints = 1..5
    for (item: Int in ints){
        println(item)
    }

    // De índices
    val list = listOf<Int>(1,2,3,4,5)
    for(id in list.indices){
        println(list[id])
    }

    // Tambien podemos usar break, continue y etiquetas



    // RANGOS

    val cerrado = 1..5 // 1,2,3,4,5
    val abierto = 1 until 5 // 1,2,3,4
    val descendente = 5 downTo 1 // 5,4,3,2,1
    val variacion = 1..5 step 2 // 1,3,5

    val i = 4
    if (i in 1..10) // Igual a "1 <= i && i <= 10"
        println(i)

    for(i in 1..4) print(i) //1234

    for(i in 4 downTo 1) print(i) // 4321

    for(i in 1..4 step 2) print(i) // 13

    for(i in 1 until 10) // i in [1,10), 10 es excluido
        println(i)



    // EXCEPCIONES

    try{
        println("excepcion")
    }catch(e: Exception){
        println("handler")
    }finally{
        // Opcional
    }

    // Puede funcionar como expresión también

    val a: Int? = try { DatatypeConverter.parseInt("hola") } catch (e:NumberFormatException) { null }

    // Las excepciones tienen el tipo "Nothing"
    val s = "hola".length ?: throw IllegalArgumentException("Name")

    try{
        fail("Name required")
        println("Todo OK")
    }catch(e: Exception){
        println("Excepción aquí")
    }

}

fun fail(message: String): Nothing{
    throw IllegalArgumentException(message)
}