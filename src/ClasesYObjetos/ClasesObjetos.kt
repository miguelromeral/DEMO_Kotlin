
// Declaración del paquete
package ClasesYObjetos

// Declaración de función
fun funcion(){}

// Declaración de clase
class Goo{}


class Invoice {
    // opcional: Constructor primario (puede tener varios secundarios)
    fun Invoice(){

    }
}

// Clases con constructor primario
class Constructor1 constructor(name: String){}
class Constructor2 (name: String){} // si no tiene modificadores

// Acceso a los parámetros del constructor
class Customer1(name: String){
    init {
        // Código que se ejecutará al llamar al constructor: init
        println("Inicializado: ${name}")
    }
}
class Customer2(name: String){
    val customerKey = name.toUpperCase()
}

// Sintaxis abreviadda

class Person1(firstName: String, lastName: String, age: Int){
    val nombre = firstName
    val apellidos = lastName
    var edad = age
}
class Person2(val nombre: String, val apellido: String, var age: Int){}


// Modificadores
//class Modificador public @Inject constructor(name: String) {}


// Constructor secundario
class Person3(val name: String){
    constructor(name: String, parent: Person3): this(name){
        //parent.children.add(this)
    }
}

/* En una clase puede haber:
- funciones
- constructores y bloques de inicialización
- propiedades
- clases anidadas e internas
- declaraciones de objetos
 */