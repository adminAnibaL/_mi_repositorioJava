package MusicaViva.Class;

public class Band {
    private String name;
    private String genre;
    private StringBuilder integrantes;
    private String hystory;

    public Band(String name, String genre) {
        this.name = name;
        this.genre = genre;
        this.integrantes = new StringBuilder();
        this.hystory = " ";
    }

    //M() agregar miembros a la banda

    public void agregarIntegrantes(String integrante) {

        if (integrantes.length() > 0) { // PRIMERO PREGUNTAMOS SI HAY ALGÚN MIEMBRO
            integrantes.append(", ");// SI ES TRUE → POR CADA MIEMBRO QUE SE ENCUENTRE - LE AGREGAMOS UNA [COMA]
        }
        integrantes.append(integrante); // Y LO SIGUIENTE ES AGREGAR UN NUEVO MIEMBRO

    }


    //M() eliminar un miembro de la banda


    public void removeMembers(String integrante) {
        //vamos a entregar una lista, es decir vamos a crear una lista de StringBuilder de miembros de la banda
        StringBuilder integrantesActivos = new StringBuilder();
        //Cada vez que quitamos algo crea algo diferente =[1234] se entrega nuevo →[134]
        //**************************************************

        // Necesitamos poder manipular 1 elemento de la lista.
        // [Si está en formato StringBuilder. No lo podemos tocar][tenemos que convertirlo a String y de la clase String utilizar {.split()}]
        // Ya que StringBuilder permite manipular elementos únicos.

        String nuevosIntegrantes = integrantes.toString(); //→ se realiza la conversión

        //Ahora lo metemos en un array para tener acceso a cada elemento
        String[] arrayNuevosIntegrantes = nuevosIntegrantes.split(",");

        for (String men : arrayNuevosIntegrantes) {
            if (!men.equals(integrante)) {
                integrantesActivos.append(" , ");
            }
            integrantesActivos.append(men);
        }

        integrantes = integrantesActivos; // actualizando la lista

    }


// M() imprimir la lista de los miembros de la banda

    public void mostrarIntegrantes() throws MusicaException {
        if (!integrantes.isEmpty()) {
            System.out.println("Lista de integrantes activos: ");

            String [] arrayIntegrantes = integrantes.toString().split(",\\s*");
            for (String men : arrayIntegrantes) {
                System.out.println("- "+ men.trim());

            }
        } else {
            throw new MusicaException("No hay  integrantes en la banda");
        }
    }

    //M() modificar historia de la banda

    // este m() permite agregar un breve historia de la banda

    public void agregarHystory(String acercaMiBanda){
        this.hystory = acercaMiBanda;

    }


}







