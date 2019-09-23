package ClasesYObjetos
// Clases de datos:
// para almacenar solo propiedades de una clase, con data

data class User(val name: String, val age: Int)

// De esta forma, el compilador nos creará:

// - equals() y hashCode()
// - toString() y tipo "ClasesYObjetos.User(name=John, age=42)"
// - funciones componentN() para cada propiedad, en orden
// - función copy()


// Función copy()

// permite copiar los datos de un objeto a otro,
// modificando alguna propiedad y mantenimiento el resto
val jack = User(name = "Jack", age = 1)
val olderJack = jack.copy(age = 2)

// Con estas clases, podemos usar "destructing declaratinos"

val jane = User("Jane", 35)
val (name, age) = jane
println("$name, $age years of age")

