package ort.tp3_login.entities

class ServicioCard
                    (notification : String?,
                    fecha : String?
) {

    var notification : String
    var fecha : String


    init {
        this.notification = notification!!
        this.fecha = fecha!!


    }
}