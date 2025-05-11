abstract class Informacion {
    fun getInformacion(): String{
        return "informacion"

    }

}
interface data{
    fun  getfunciondata(): String


}


open class Hotel(public val nombre: String, private var direccion: String, internal val telefono: Int):data, Informacion()
{
    open fun getdireccion():String{
        return direccion

    }
    fun setdireccion (direccion: String){

        this.direccion = direccion

    }

    override fun getfunciondata(): String {
        TODO("Not yet implemented")
    }


    class Ususarios(val nombre: String, val Email: String){
        override fun toString(): String {
            return "ususario (nombre = '$nombre', email ='$Email')"

        }

    }
    class Usuario (val nombre: String, val email: String ){

        override fun toString(): String {
            return "ususario (nombre = '$nombre', email ='$email')"
        }
    }
    inner class Habitacion (val numero: Int, val piso: String){
        override fun toString(): String {
            return "habitacion (numero = '$numero', piso ='$piso')"
        }
        fun gethotel(): String{
            return "Hotel (nombre = '$nombre', direccion = '$direccion', telefono = '$telefono')"

        }
        fun methodpadre(){
            getdireccion()
        }

    }


    //public
    //private
    //internal funciona si hace herencia


}

class servicios : Hotel("hotel2", "calle1", 33244 ){
    override fun getdireccion(): String {
        return super.getdireccion()
    }
}