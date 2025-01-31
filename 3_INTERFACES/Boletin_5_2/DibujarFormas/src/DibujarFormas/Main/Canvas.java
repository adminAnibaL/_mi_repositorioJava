package DibujarFormas.Main;

import DibujarFormas.Class.*;

public class Canvas {

    public void dibujaYAnimaFormas(Forma[] formas) {

        for (Forma forma : formas) {
            System.out.println(forma);
        }

    }

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();
        Linea linea = new Linea();
        CirculoMovible circuloMovible = new CirculoMovible();


//        Forma[] formas = {triangulo, circulo, linea, circuloMovible};


    }

}
