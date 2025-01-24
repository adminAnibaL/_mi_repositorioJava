
package String;

/*Este programa cuenta cuantas mayusculas minusculas, numeros y (signos)*/
// Dado que si no es nada de esto lo hemos de catalogar como un signo

/*La funcion esta diseñada para devolver un array con todos lo contadores y sus respectivos resultados*/
// return new int[]{contarMayus, contarMin, contarNum, contarSignos}


import java.util.Scanner;

public class ContarMayMinNumSig {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena con multiple valores");
        String cadena = sc.nextLine();


  //      CaracteresMultiples cm = new CaracteresMultiples();

        int[] contadores = contarMultipleValores(cadena);

        System.out.println("Mayus = " + contadores[0]);
        System.out.println("Minus = " + contadores[1]);
        System.out.println("Num = " + contadores[2]);
        System.out.println("Signos = " + contadores[3]);


    }

    public static int[] contarMultipleValores(String cadena) {

        int contarMayus = 0;
        int contarMin = 0;
        int contarNum = 0;
        int contarSignos = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char cadenaTotal = cadena.charAt(i);


            if (Character.isUpperCase(cadenaTotal)) {
                contarMayus++;

            } else if (Character.isLowerCase(cadenaTotal)) {
                contarMin++;

            } else if (Character.isDigit(cadenaTotal)) {

                contarNum++;
            } else {
                contarSignos++;

            }


        }

        return new int[]{
                contarMayus, contarMin, contarNum, contarSignos
        };
    }

}
