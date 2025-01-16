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
        this.monedero = monedero;
        this.depositoCafe = depositoCafe;
        this.depositoLeche = depositoLeche;
        this.depositoVasos = depositoVasos;
    }

    public MaquinaCafe() {
        this(FONDO_DE_CAJA, 50, 50, 80);
    }

    //******************************************************************************* FIN CONSTRUCTORES


    public boolean servirCafeSolo(double cantidad) {
        //primero compobaremos que maquina tenga los recursos disponibles para la elaboración del producto

        if (depositoCafe > 0 && depositoLeche > 0 && depositoVasos > 0) {
            if (cantidad >= CAFE_SOLO) {
                depositoCafe--;
                depositoVasos--;
                monedero += CAFE_SOLO;  // Asegúrate de agregar un punto y coma aquí

                double devolucion = cantidad - CAFE_SOLO;
                if (devolucion > 0) {
                    System.out.printf("Recoja su cambio: %.2f€\n", devolucion);
                }
                System.out.println("Su café solo está listo.");
                return true;  // Café servido correctamente
            } else {
                System.out.println("No tiene suficiente dinero para un café solo.");
                return false;  // No tiene suficiente dinero
            }
        } else {
            System.out.println("La máquina no tiene los recursos disponibles para elaborar el producto.");
            return false;  // No hay suficientes recursos
        }
    }

    public void mostrarRecursos() {
        System.out.println("Estado actual de la máquina:");
        System.out.printf("Café: %d\n", depositoCafe);
        System.out.printf("Leche: %d\n", depositoLeche);
        System.out.printf("Vasos: %d\n", depositoVasos);
        System.out.printf("Monedero: %.2f€\n", monedero);
    }


}


