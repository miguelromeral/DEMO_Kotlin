package ClasesYObjetos

// Permiten añadir nueva fncionalidad sin tener que heredar

// Añademos el metodo swap a la clase MutableList
fun MutableList<Int>.swap(index1: Int, index2: Int){
    val tmp = this[index1] // 'this' es la lista
    this[index1] = this[index2]
    this[index2] = tmp
}

// También propiedades

val <T> List<T>.lastIndex: Int
    get() = size - 1