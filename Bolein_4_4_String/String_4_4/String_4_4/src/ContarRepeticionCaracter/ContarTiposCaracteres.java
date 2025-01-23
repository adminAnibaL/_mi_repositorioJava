package ContarRepeticionCaracter;

public class ContarTiposCaracteres {
    public static void main(String[] args) {

        String cadena = "Hola amigos como estasmos 24234";

        int[] resultado = contarRepeticionCaracter(cadena);

        System.out.println("Resultado: " + resultado[0] + "  Mayúsculas");
        System.out.println("Resultado: " + resultado[1] + "  Minusculas");
        System.out.println("Resultado: " + resultado[2] + "  Numeros");


    }

    public static int[] contarRepeticionCaracter(String cadena) {
        int contMayus = 0;
        int contMinus = 0;
        int contNum = 0;
        int contSignos = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isUpperCase(cadena.charAt(i))) {
                contMayus++;
            }
            if (Character.isLowerCase(cadena.charAt(i))) {
                contMinus++;
            }
            if (Character.isDigit(cadena.charAt(i))) {
                contNum++;
            }


        }


        return new int[]{contMayus, contMinus, contNum};
    }


}
