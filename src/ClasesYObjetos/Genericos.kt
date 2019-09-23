package ClasesYObjetos

// Tipos genéricos, como java

class Box<T>(t: T){
    var value = t
}

// Cuando usemos esa clase, tenemos que especificar el tipo de dato

val box: Box<Int> = Box<Int>(1)
val anotherBox = Box(1)
// 1 has type Int, so the compiler
// figures out that we are talking about Box<Int>

