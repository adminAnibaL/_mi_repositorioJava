package Boletin_4_1.ArrayRectangulo.Main;

import Boletin_4_1.ArrayRectangulo.Class.ArrayRectangulo;

public class Main {

    public static void main(String[] args) {

        ArrayRectangulo rect = new ArrayRectangulo();
        rect.setDimensiones(8, 4);

        rect.dibujarRectangulo();
        System.out.print(rect.calcularArea());

    }


}
