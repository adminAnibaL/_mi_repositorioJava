package ReservaCine.Class;

public class Cine {

    /*El cine tiene varias salas*/
    private String id_sala;
    private int numButacasMax;
    private int numButacasOcupadas;

    /*
     * Constructor
     * */

    public Cine(String id_sala, int numButacasMax, int numButacasOcupadas) {
        this.id_sala = id_sala;
        this.numButacasMax = numButacasMax;
        this.numButacasOcupadas = numButacasOcupadas;
    }

    public Cine(String id_sala) {
        this.id_sala = id_sala;
        this.numButacasMax=25;
        this.numButacasOcupadas=0;
    }

    public boolean realizarReserva(int cantidad) throws CineException{


            throw new CineException("No hay butacas disponibles");



    }



}
