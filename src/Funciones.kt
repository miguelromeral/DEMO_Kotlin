import com.sun.corba.se.impl.orbutil.graph.Graph
import sun.security.provider.certpath.Vertex
import java.util.concurrent.locks.Lock

// Definición de función

fun double(x: Int): Int {

}

val result = double(2)


// PARÁMETROS Y ARGUMENTOS

// Parámetros: declaraciones de variables usadas desde dentro de la función
// Valores: que le pasamos a la función.

// Los parametros pueden tener valor por defecto

fun read(b: Array<Byte>, off: Int = 0/*, len: Int = b.size()*/){

}

// Podemos poner etiquetas de argumentos explícitas

fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' '){
    // ...
}

val str: String = "asdasdasd"
reformat(str)
reformat(str, true, true, false, '_') // no da pistas
reformat(str,
    normalizeCase = true,
    upperCaseFirstLetter = true,
    divideByCamelHumps = false,
    wordSeparator = '_'
)
reformat(str, wordSeparator = '_')



// Tipo de retorno Unit (que no devuelva nada)

fun printHello(name: String?): Unit {
    if(name != null)
        println("Hello ${name}")
    else
        println("Hi there!")
    // 'return Unit' or 'return' is optional
}

fun printHello2(name: String?){}


// Funciones de una expresión
// si solo hay una expresión, la de retorno, podemos poner igual

fun double2(x: Int): Int = x * 2
fun double3(x: Int) = x * 2



// Parámetros indeterminados

// Son parametros que permiten introducir múltiples valores
// Se declaran con el modificador vararg
// Los valores tienen que ser del mismo tipo
// Los valores llegan a la función como un array del tipo apropiado
// Solo puede haber uno

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for(t in ts) // ts is an Array
        result.add(t)
    return result
}
val list = asList(1,2,3)



// Las funciones se pueden crear en el ámbito global,
// no hace falta contenerlas en una clase, también pueden ser
// miembros o locales

// Función global

fun dfs(graph: Graph){
    val visited = HashSet<Vertex>()
    // Función local
    fun dfs(current: Vertex){
        if(!visited.add(current)) return
        for(v in current.neighbors)
            dfs(v)
    }
    dfs(graph.vertices[0])
}

// Función miembro

class Sample(){
    fun foo() { print("Foo") }
}

// También podemos hacerlas genéricas

fun <T> singletonList(item: T): List<T> {

}





// Funcinoes de primer orden y lambda

// de primer orden: admite funciones como parámetros o devuelve una función

// La función que podemos incluir será la de body,
// pero debe cumplir con esa forma
fun <T> lock(lock: Lock, body: () -> T): T
{
    lock.lock()
    try{
        return body()
    }
    finally {
        lock.unlock()
    }
}

// Pasos de función como argumento
fun toBeSynchronized() = sharedResource.operation()
val result = lock(lock, ::toBeSynchronized) // Referencia a función
val result2 = lock(lock, { sharedResource.operation() }) // lambda

//
fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
    val result = arrayListOf<R>()
    for(item in this)
        result.add(transform(item))
    return result
}
val doubled = ints.map { value -> value * 2 }



// Las expresiones lambda son funciones anonimas
max(string, { a, b -> a.length < b.length })
// Sintaxis: List< de parámetros (y su tipo, aunque se puede deducir),
// retorno, cuerpo
val sum = { x:Int, y:Int -> x + y }
val sum2: (Int, Int) -> Int = { x, y -> x + y }

// Si solo hay un parámetro, podemos usar el nombre "it"
ints.filter { it > 0 }


// Las funciones lambda pueden acceder a su cierre (clausura),
// las variables de ámbito superior, pudiendo modificarlas

var sum3 = 0
ints.filter { it > 0 }.forEach {
    sum3 += it
}
print(sum)