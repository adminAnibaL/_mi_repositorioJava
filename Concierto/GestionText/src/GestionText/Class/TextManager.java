package GestionText.Class;

public class TextManager {

    // m() para contar palabras

    public static void cuentaPalabras(String cadena) {

        int numPalabras = 0;

        String[] arrayPalabras = cadena.split(" ");

        for (String words : arrayPalabras) {
            numPalabras = arrayPalabras.length;
        }
        System.out.println("La frase contiene → " + numPalabras + " palabras");


    }


    public static String reverseText(String cadena) {
        StringBuilder sb = new StringBuilder();

        String[] newSb = cadena.split(" ");
        for (String newb : newSb) {

            sb.insert(0, newb + " ");
        }
        return sb.toString();
    }


    // con un for nomal tambien sirve
    /*
    *
        String[] newSb = cadena.split(" ");
        for (int i = newSb.length - 1; i > 0; i--) {
            sb.append(newSb[i]);
            if(i !=0){
                sb.append(" ");
            }

    * */

}






