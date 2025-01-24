package Boletin_4_1.Rectangulo.Main;
/* ARRAY-RECTANGULO*/


import Boletin_4_1.Rectangulo.Class.Rectangulo;

public class Main {



    public static void main(String[] args) {
        System.out.println("Hola soy un triangulo ");


        Rectangulo rect = new Rectangulo(10 , 20);


        System.out.println("El area es: "+ rect.calcularArea());
        System.out.println("El Perimetro  es: "+ rect.calcularPerimetro());



    }
}
