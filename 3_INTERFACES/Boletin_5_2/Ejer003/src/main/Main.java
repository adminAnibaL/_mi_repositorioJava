package main;

import interfaces.Enviable;
import interfaces.Imprimible;
import models.Documento;

public class Main {
    public static void main(String[] args) {

        Documento document1 = new Documento();
        if (document1 instanceof Enviable doc) {
            doc.enviar();
        }
        if (document1 instanceof Imprimible doc) {
            doc.imprimir();
        }
    }


}
