package com.miapp.interfaces;

import com.miapp.abstractmodels.Juguete;

public interface Apilable {
    default void apliar(Juguete juguete) {
        if (this.equals((juguete))) {
        }

        if(!(juguete instanceof  Apilable)){

        }
        //if //Me falta// aqui comprobamos si la instacia ** intanceOF **

        if(!this.getClass().equals(juguete.getClass())){ // si no es de mi misma clase lanzo una excepción

        }
    }


    //M() Default → estudiar, para que sirve

    //Una vez dotado con poderes la interfaza, llamamos en la clase [Apilable.super.apilar(juguete)]

}
/*
* Comprobacion que sea del mismo tipo
*
* if (this.getClass() != a.getClass()){
* }
*
*
* */


// Estudiar contenedores Java
// <T> <E> <K> <V> -> Convenciones para asignar tipos de obejtos genéricos
// Streams