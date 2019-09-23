package ClasesYObjetos
// Un interfaz no almacena estado
// Pueden tener propiedades, pero han de ser abstractas o
// tener implementados los metodos de acceso

interface MyInterface {
    fun bar()
    fun foo() {
        // Optional body
    }
}

// Una clase puede implementar múltiples interfaces (separados por comas)

class Child : MyInterface {
    override fun bar() {
        // body
    }
}



// Usando propiedades

interface MyInterface2 {
    val prop: Int // abstracta

    val propertyWithImplementation: String
        get() = "foo"

    fun foo(){
        print(prop)
    }
}

class Child2 : MyInterface2 {
    override val prop: Int = 29
}


// En caso de conflictos, tambiénn haremos uso de super<>, como en la herencia