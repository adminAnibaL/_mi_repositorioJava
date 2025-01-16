package Boletin_4_1.MaquinaCafe.Class;


public class MaquinaCafe {


    //--------------------------
    // CONSTANTES  PRECIOS PRODUCTOS
    // --------------------------
    private static final double CAFE_SOLO = 1.00;
    private static final double SOLO_LECHE = 0.80;
    private static final double CAFE_CON_LECHE = 1.50;

    //--------------------------
    // LA CAJA
    //--------------------------

    private static final double FONDO_DE_CAJA = 5.0;
    private double monedero;
    //--------------------------
    // CONTADORES [VARIABLES DE INSTANCIA]
    //--------------------------
    private int depositoCafe;
    private int depositoLeche;
    private int depositoVasos;

    // Cada vez que se "CREE" una máquina tendrá una version completa,
    // es decir, con los depósitos llenos y monedero inicial "FONDO DE CAJA"

    // creando constructor global VersionFULL

    public MaquinaCafe(double monedero, int depositoCafe, int depositoLeche, int depositoVasos) {
        this.monedero = FONDO_DE_CAJA;
        this.depositoCafe = depositoCafe;
        this.depositoLeche = depositoLeche;
        this.depositoVasos = depositoVasos;
    }

    public MaquinaCafe() {
        this(FONDO_DE_CAJA, 50, 50, 80);
    }

    //******************************************************************************* FIN CONSTRUCTORES










    //m() funcion para actulizar monedero

/*
    public double ingresoMonedero(double cantidad) {


        if (monedero > cantidad) {
            double devolver = cantidad - CAFE_SOLO;
            System.out.println("Se devuelve: " + devolver + "€");
        } else if (monedero < cantidad) {
            System.out.println("Saldo insuficiente para devolver ");
        }
        return monedero += cantidad - CAFE_SOLO;
    }

*/
}
