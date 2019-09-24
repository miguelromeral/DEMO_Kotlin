// ARRAYS

// 0 --> N-1
val datos = arrayOf(1, 2, 3)
datos[1] = 5
println(datos[2])
datos[3] = 0 // excepción

// Tenemos funciones que nos crean arrays (mas eficiente):
val x: IntArray = intArrayOf(1, 2, 3)
x[0] = x[1] + x[2]


// crear arrays con funcinoes factoria

// Crea un array de String con valores ["0", "1", "4", "9", "16"]
val asc = Array(5, { i -> (i*i).toString() })
val asc2 = Array(5) { i -> (i*i).toString() }

val datos2 = Array<Int>(4) {0}


// Matrices y arrays multidimensionales

var m = 1

val a = Array<Array<Int>>(2){
    Array<Int>(2) {m++}
}
// 1 2
// 3 4
fun function() {
    for (p in 0..1) {
        for (j in 0..1) {
            print("%2d".format(a[p][j]))
        }
        println()
    }
}




// Listas, conjuntos y diccionarios

/*
 Tipo        Inmutable       Mutable
 Lista       List<out T>     MutableList<T>
 Conjunto    Set<out T>      MutableSet<T>
 Diccionario Map<K, out V>   MutableMap<K, V>
 */

// Listas

val numbers: MutableList<Int> = mutableListOf(1,2,3)
val readOnlyView: List<Int> = numbers
fun otra() {
    println(numbers) // "[1, 2, 3]"
    numbers.add(4)
    println(readOnlyView) // "[1, 2, 3, 4]"
    readOnlyView.clear() // NO compila

    // las listas tienen metodos que podemos usar
    val items = listOf(1, 2, 3, 4)
    items.first() == 1
    items.last() == 4
    items.filter {it % 2 == 0 } // returns [2, 4]

    val rwList = mutableListOf(1,2,3)
    rwList.requireNoNulls() // returns [1, 2, 3]
    if(rwList.none { it > 6 }) println("No items above 6")
    val item = rwList.firstOrNull()
}


// Conjuntos

val strings = hashSetOf("a", "b", "c", "c")
fun otra2(){
    println(strings.size == 3)
}


// Diccionarios

val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
println(readWriteMap["foo"]) // prints "1"
val snapshot: Map<String, Int> = HashMap(readWriteMap)
