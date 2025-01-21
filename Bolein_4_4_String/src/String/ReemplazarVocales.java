package String;

import java.util.Scanner;



/*El enunciado solicita reemplazar vocales por un [*]*/

public class ReemplazarVocales {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "Amiga hola soy una cadena de texto a reemplazar";


        //paso ultimo llamando al m()
        String cadenaReemplazada = reemplazarVocales(cadena);

        System.out.println("La cadena reemplazada es= " + cadenaReemplazada);


        //paso ultimo llamando al 2do m()

        String cadena2 = bucandoYRemplanzao(cadena);
        System.out.println(cadena);
        System.out.println(cadena2);


    }


    //Creando un m() Funciona - Voy a probar con el m() -indexOf()

    public static String reemplazarVocales(String cadena) {

        StringBuilder sb = new StringBuilder();
        String primeraForma = cadena.toLowerCase().trim(); // → le quito todos los espacio en blanco, y la transformo a minúscula

        for (int i = 0; i < primeraForma.length(); i++) {
            char letra = primeraForma.charAt(i); // → tomamos la primera letra en la actual posición de (i) y la guardamos en la variable {letra}
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                sb.append('*'); //
            } else {
                sb.append(letra);
            }
        }

        return sb.toString();


    }


    public static String bucandoYRemplanzao(String cadena) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if ("aeiouAeiou".indexOf(c) != -1) {
                sb.append('*');
            }else{
                sb.append(c);
            }
        }

        return sb.toString();
    }


}
