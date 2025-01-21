
package String;
/*
 * Crear un programa que solicite al usuario una cadena de texto y un carácter.
 * Luego, el programa debe reemplazar
 * todas las apariciones de ese carácter en la cadena
 * por otro carácter ingresado por el usuario.
 * Finalmente, mostrar por pantalla la cadena resultante.
 * No debe distinguir entre mayúsculas y minúsculas.
 * */

import java.util.Scanner;

public class InsertarBuscarRemplazar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena de Texto Multiple");
        String cadena = sc.nextLine();
        System.out.println("Ingrese el caracter a remplazar");
        char caracter = sc.next().charAt(0);
        System.out.println("Ingrese caracter a insertar");
        char caracterInsertado = sc.next().charAt(0);

        String sb = insertarTexto(cadena, caracter, caracterInsertado);

        System.out.println("La cadena nueva es= " + sb);


    }


    public static String insertarTexto(String cadena, char caracter, char caracterInsertado) {

        StringBuilder sb = new StringBuilder();
        char caracterMin = Character.toLowerCase(caracter);


        for (int i = 0; i < cadena.length(); i++) {

            char charActual = cadena.charAt(i);
            if (Character.toLowerCase(charActual) == caracterMin) {
                sb.append(caracterInsertado);
            } else {
                sb.append(charActual);
            }

        }
        return sb.toString();
    }

    //Avanzado Contar las apariciones de un carácter en una cadena sin distinguir Mayus/Minus

    public static int contarCaracter(String cadena, char caracter){

        return (int) cadena.toLowerCase().chars()
                .filter(c -> c == Character.toLowerCase(caracter))
                .count();

    }

}



