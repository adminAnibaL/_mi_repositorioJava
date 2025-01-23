package ContarRepeticionCaracter;

import java.util.Scanner;

public class Contar {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto");
        String texto = sc.nextLine();
        System.out.println("Ingrese el caracter a buscar");
        char caracter = sc.next().charAt(0);

        contarCaracteres(texto, caracter);
    }


// creando m() que devuelve cuantas veces se repite un carácter en una cadena de texto

    public static int contarCaracteres(String cadena, char c) {
        String cadenaAux = cadena.toLowerCase().trim();

        int count = 0;
        for (int i = 0; i < cadenaAux.length(); i++) {
            if (cadena.charAt(i) == c) {
                count++;
            }

        }
        System.out.println("El caracter " + c + "  se repite  " + count);
        return count;

    }
}