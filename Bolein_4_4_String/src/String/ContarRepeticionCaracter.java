package String;



/*Este programa te permite, ingresar una cadena de texto y solicitar que caracter deseas saber cuantas veces se repite*/

import java.util.Scanner;

public class ContarRepeticionCaracter {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un cadena");
        String cadena = sc.nextLine();
        System.out.println("Ingrese el caracter a buscar");
        char caracter = sc.nextLine().charAt(0);

        //Trabajando con la función


        int contador = contarRepeticionCaracter(cadena, caracter);

        System.out.println("Ha Ingresado → [" + cadena + "]");
        System.out.println("El caracter  [" + caracter + "] se repite [" + contador + "] veces");

    }

    public static int contarRepeticionCaracter(String cadena, char caracter) {
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {

            char letra = cadena.charAt(i);
            if (letra == Character.toLowerCase(caracter)) {
                contador++;
            }

        }

        return contador;

    }
}
