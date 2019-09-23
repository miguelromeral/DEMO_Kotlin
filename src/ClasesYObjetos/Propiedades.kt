package ClasesYObjetos

class Address{
    var name: String = ""
    var street: String = ""
    var city: String = ""
    var state: String? = null
    var zip: String = ""
    // El tipo se puede sobreentender
    var size = 0

    // Metodos Get y Set
    val isEmpty: Boolean
        get() = this.size == 0

    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            this.name = value
        }
}


fun copyAddress(address: Address): Address {
    val result = Address()
    // No estamos cogiendo el valor directamente,
    // estamos llamando al método Get
    result.name = address.name;
    result.street = address.street;

    return result;
}


