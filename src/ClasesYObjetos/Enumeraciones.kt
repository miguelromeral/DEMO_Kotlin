package ClasesYObjetos

enum class Direction {
    NORTH,
    SOUTH,
    WEST,
    EAST
}


val direccion = Direction.NORTH

fun prueba(dir: Direction){
    when(dir){
        Direction.NORTH -> print("Vamos bien")
        Direction.EAST -> print("Un poco desviados")
        Direction.WEST -> print("Where de skies are blue")
        Direction.SOUTH -> print("no, no vamos bien")
    }
}