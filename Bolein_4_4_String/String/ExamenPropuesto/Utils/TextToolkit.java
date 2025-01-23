package String.ExamenPropuesto.Utils;

import java.util.Scanner;

/**
 * Clase utilitaria "Navaja Suiza" para trabajar con texto.
 */
public class TextToolkit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto para realizar pruebas:");
        String cadena = sc.nextLine();

        // Ejemplo de uso de los métodos
        int[] contadores = contarCaracteres(cadena);
        System.out.println("Mayúsculas: " + contadores[0]);
        System.out.println("Minúsculas: " + contadores[1]);
        System.out.println("Números: " + contadores[2]);
        System.out.println("Signos: " + contadores[3]);

        System.out.println("Ingrese un carácter para contar su repetición:");
        char caracter = sc.nextLine().charAt(0);
        int repeticiones = contarRepeticionCaracter(cadena, caracter);
        System.out.println("El carácter '" + caracter + "' se repite " + repeticiones + " veces.");

        System.out.println("Ingrese un carácter para reemplazar:");
        char aReemplazar = sc.next().charAt(0);
        System.out.println("Ingrese el carácter de reemplazo:");
        char reemplazo = sc.next().charAt(0);
        String cadenaReemplazada = reemplazarCaracter(cadena, aReemplazar, reemplazo);
        System.out.println("Cadena después del reemplazo: " + cadenaReemplazada);

        System.out.println("Cadena con vocales reemplazadas por '*': " + reemplazarVocales(cadena));

        sc.close();
    }

    /**
     * Cuenta mayúsculas, minúsculas, números y signos en una cadena.
     *
     * @param cadena la cadena de texto
     * @return un arreglo con los conteos en el orden: [mayúsculas, minúsculas, números, signos]
     */
    public static int[] contarCaracteres(String cadena) {
        int contarMayus = 0;
        int contarMin = 0;
        int contarNum = 0;
        int contarSignos = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (Character.isUpperCase(c)) {
                contarMayus++;
            } else if (Character.isLowerCase(c)) {
                contarMin++;
            } else if (Character.isDigit(c)) {
                contarNum++;
            } else {
                contarSignos++;
            }
        }

        return new int[]{contarMayus, contarMin, contarNum, contarSignos};
    }

    /**
     * Cuenta cuántas veces se repite un carácter en una cadena (sin distinguir entre mayúsculas y minúsculas).
     *
     * @param cadena   la cadena de texto
     * @param caracter el carácter a buscar
     * @return la cantidad de repeticiones del carácter
     */
    public static int contarRepeticionCaracter(String cadena, char caracter) {
        int contador = 0;
        char caracterMin = Character.toLowerCase(caracter);

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.toLowerCase(cadena.charAt(i)) == caracterMin) {
                contador++;
            }
        }

        return contador;
    }

    /**
     * Reemplaza todas las apariciones de un carácter en una cadena por otro carácter (sin distinguir mayúsculas y minúsculas).
     *
     * @param cadena          la cadena de texto
     * @param caracterBuscar  el carácter a reemplazar
     * @param caracterReemplazo el carácter de reemplazo
     * @return la cadena resultante después del reemplazo
     */
    public static String reemplazarCaracter(String cadena, char caracterBuscar, char caracterReemplazo) {
        StringBuilder sb = new StringBuilder();
        char caracterBuscarMin = Character.toLowerCase(caracterBuscar);

        for (int i = 0; i < cadena.length(); i++) {
            char actual = cadena.charAt(i);
            if (Character.toLowerCase(actual) == caracterBuscarMin) {
                sb.append(caracterReemplazo);
            } else {
                sb.append(actual);
            }
        }

        return sb.toString();
    }

    /**
     * Reemplaza todas las vocales en una cadena por el carácter '*'.
     *
     * @param cadena la cadena de texto
     * @return la cadena con las vocales reemplazadas por '*'
     */
    public static String reemplazarVocales(String cadena) {
        StringBuilder sb = new StringBuilder();
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < cadena.length(); i++) {
            char actual = cadena.charAt(i);
            if (vocales.indexOf(actual) != -1) {
                sb.append('*');
            } else {
                sb.append(actual);
            }
        }

        return sb.toString();
    }
}
