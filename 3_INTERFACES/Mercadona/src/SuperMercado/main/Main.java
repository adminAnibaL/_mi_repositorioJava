package SuperMercado.main;

import SuperMercado.models.Cereales;
import SuperMercado.models.Detergente;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Detergente detergente1 = new Detergente("Don Limpio",3.40);
        Cereales cereales1 = new Cereales("Hacendado",3.30,"Espelta");
        cereales1.setCaducidad(LocalDate.of(2025,02,15) );

        System.out.println(cereales1.toString());

    }
}
