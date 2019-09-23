package ClasesYObjetos

// Todas las clases heredan de Any (no es igual a "Object" en Java)

// "open" indica que es la clase base,
open class Base(p: Int)
// luego, llamamos al constructor de la clase "opened"
// Con constructor primario
class Derived(p: Int) : Base(p)


// open es al contrario que java.
/* Todas las clases en Kotlin son "finales" a menos
que se indique con "open"
 */


// Herencia con constructores secundarios
/*
class MyView : View {
    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attrs: AttributeSet) : super (ctx, attrs)
}
*/



// REDEFINIR MÉTODOS
// El método debe estar marcado como open
// el override hace que la funcion sea open también,
// podemos caparlo poniendo "final override..."

open class Base2{
    open fun v() {}
    fun nv() {}
}

class Derived2() : Base2(){
    override fun v() {}
}

// También se pueden redefinir las propiedades
// Se permite redefinir una propiedad val con una var, pero no al revés




// En caso de conflictos, debemos especificarlo con "diamantes"

open class A{
    open fun f() { print("ClasesYObjetos.A") }
    fun a() { print("a") }
}
interface B{
    // Los miembros de la interfaz son "open" por defecto
    fun f() { print("ClasesYObjetos.B") }
    fun b() { print("b") }
}
class C(): A(), B {
    // el compilador necesita que f() sea sobreescrita
    override fun f(){
        super<A>.f() // call to ClasesYObjetos.A.f()
        super<B>.f() // call to ClasesYObjetos.B.f()
    }
}




// CLASES ABSTRACTAS

open class Base3 {
    open fun f() {}
}
abstract class Derived3 : Base3() {
    // No hace falta poner open
    // porque las derivaremos sí o sí
    override abstract fun f()
}