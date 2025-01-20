package Persona.Class;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Creamos una persona
        Persona persona1 = new Persona(
                "Juan Pérez",
                LocalDate.of(1990, 5, 15), // Fecha de nacimiento (año, mes, día)
                12345678, // DNI sin letra
                'M', // Sexo 'M' (masculino)
                1.75, // Altura en metros
                70.5 // Peso en kilogramos
        );

        // Creamos 2da Persona

        Persona persona2 = new Persona("Anibal Solano", LocalDate.of(1988, 8, 26), 55481193, 'M', 1.60, 90.5);


        DateTimeFormatter formatoSpain = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Mostramos los datos de la persona
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Fecha de nacimiento: " + persona1.getFechaNacimiento().format(formatoSpain));
        System.out.println("DNI: " + persona1.getDni());
        System.out.println("Sexo: " + persona1.getSexo());
        System.out.println("Altura: " + persona1.getAltura() + " metros");
        System.out.println("Peso: " + persona1.getPeso() + " kg");

        // Obtener y mostrar la letra del DNI
        System.out.println("Letra del DNI: " + persona1.getLetraDni());

        // Calcular y mostrar el IMC
        System.out.println("IMC: " + persona1.getIMC());

        // Obtener y mostrar la letra del DNI
        System.out.println("Letra del DNI: " + persona2.getLetraDni());

        // Calcular y mostrar el IMC
        System.out.println("IMC: " + persona2.getIMC());
        System.out.println("\n");
        System.out.println(persona2.toString());

    }
}
