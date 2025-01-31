package com.miapp.interfaces;

import com.miapp.modelsAbstract.Juguete;
import com.miapp.utils.JugueteException;

public interface Apilable {
    // interfaz por defecto()

    default void apilar (Juguete juguete)throws JugueteException {
        if(this.equals(juguete)){
            throw new JugueteException("No se puede apilar");
        }

        if(!(juguete instanceof Apilable)){

        }

    }

}
