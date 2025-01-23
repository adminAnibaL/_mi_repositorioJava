package GestionText.Main;

import GestionText.Class.TextManager;

public class Main {
    public static void main(String[] args) {

        TextManager textManager = new TextManager();
        String palabras = "Hola amigos, estoy programando en Java";


        textManager.cuentaPalabras(palabras);

        String reverse = textManager.reverseText(palabras);
        System.out.println(reverse);
        System.out.println(palabras);

    }



}
