import java.io.BufferedReader
import java.io.InputStreamReader
import javax.swing.JOptionPane

fun elementales(){

    // Asignación de variables de solo lectura
    val a: Int = 1
    val b = 20 // Inferencia de tipos: el comilador deduce que será Int
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


    // Cadenas de texto

    // String (son inmutables)
    val s = "Hello, World!\n"
    // Raw string (multilinea)
    val text = """
        for (c in "foo")
            print(c)
    """
    // Plantillas de string
    val i = 2
    val os = "i = $i"
    val str = "$s.length is ${s.length}"

    // Caracteres (con comillas simples)
    var letra: Char = 'A'

    // Operadores aritméticos
    var r1 = 1 + 2
    r1 += 3
    r1 = 5 - 3
    r1 = 5 * 10
    r1 = 10 / 2
    r1 = 10 % 4
    r1 = -r1
    r1 = +r1

    // Entrada y salida de datos

    print("Escriba cualquier cosa: ")
    val br = BufferedReader(InputStreamReader(System.`in`))
    var texto = br.readLine()
    println("Ha escrito: $texto")

    // Cuadros de diálogo
    texto = JOptionPane.showInputDialog("Escriba su nombre:")
    JOptionPane.showMessageDialog(null, "Su nombre es $texto")


    // Tipos de daros anulables

    var nulabl: String? = "abc" // Debe llevar el ?
    nulabl = null

    val nulable: String? = null;

    //Comprobacion de null (solo se puede usar con variables inmutables: val)
    if(nulable != null)
        println("b no es null")

    // Operador de llamada segura
    val l: Int? = nulable?.length
    // Encadenable
    // bob?.department?.head?.name

    // Operador Elvis
    val l2 = nulable?.length ?: -1
    // Si es null, valor por defecto

    // Operador !! (no muy recomendable...)
    //val l3 = nulable!!.length
    // Puede producir una excepción NPE en tiempo de ejecución



    // Conversión de tipos



    // NO EXISTEN LAS CONVERSIONES IMPLÍCITAS

    // Conversiones explícitas únicamente
    val b2: Byte = 1
    //ERROR: val i: Int = b
    val i3: Int = b2.toInt() // Disponibles para los tipos predeterminados

    val obj = "hola"

    // Smart cast
    if (obj is String)
        println(obj.length)

    if(obj !is String) // Igual que !(obj is String)
        println("Not a string")
    else
        println(obj.length)


    // Unsafe cast

    val y = "hhh"
    val x1: String = y as String // unsafe -> si y es null, excepción

    val x2: String? = y as String? // admite null -> no hay excepción

    val x3: String? = y as? String // safe -> si y es null, no excepción


}