package String.ExamenPropuesto.Class;

import java.util.Scanner;

import String.ExamenPropuesto.Utils.TextToolkit;

public class Main {

    public final static String dominio = "@redCorporation.com";


    public static void main(String[] args) {
        //Instanciando Usuario


        TextToolkit funcion = new TextToolkit();
        Scanner sc = new Scanner(System.in);

        RedCorporation corporation = new RedCorporation();


        System.out.println("Welcome to the RedCorporation");


        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = sc.nextLine();
        System.out.println("ingrese un numero favorito");
        int numFavorito = sc.nextInt();

        Usuario usuario2 = new Usuario(nombre, apellido, numFavorito);

        int [] contadores= generarCorreo(usuario2);

        System.out.println("Mayus = " + contadores[0]);
        System.out.println("Minus = " + contadores[1]);
        System.out.println("Num = " + contadores[2]);
        System.out.println("Signos = " + contadores[3]);

    }

    public static int[] generarCorreo(Usuario usuario) {

        String primeraForma = usuario.getNombre();
        int[] conteo = TextToolkit.contarCaracteres(primeraForma);

return conteo;
    }

/*  // Usar la clase TextToolkit para eliminar tildes y ñ en el nombre y apellido
        String nombreSinTildes = eliminarTildes(usuario.getNombre());
        String apellidoSinTildes = eliminarTildes(usuario.getApellido());

        // Reemplazar las vocales en el nombre y apellido
        nombreSinTildes = TextToolkit.reemplazarVocales(nombreSinTildes);
        apellidoSinTildes = TextToolkit.reemplazarVocales(apellidoSinTildes);

        // Crear el correo utilizando las tres primeras letras del nombre y apellido
        String correo = nombreSinTildes.substring(0, Math.min(3, nombreSinTildes.length())) +
                        apellidoSinTildes.substring(0, Math.min(3, apellidoSinTildes.length())) +
                        dominio;

        System.out.println("Correo corporativo generado: " + correo.toLowerCase());
    }

    // Función para eliminar tildes y ñ
    public static String eliminarTildes(String texto) {
        // Normalizar el texto para eliminar los caracteres acentuados y ñ
        String textoNormalizado = java.text.Normalizer.normalize(texto, java.text.Normalizer.Form.NFD);
        textoNormalizado = textoNormalizado.replaceAll("[^\\p{ASCII}]", "");  // Remover caracteres no ASCII

        return textoNormalizado;
    }
}*/

}
