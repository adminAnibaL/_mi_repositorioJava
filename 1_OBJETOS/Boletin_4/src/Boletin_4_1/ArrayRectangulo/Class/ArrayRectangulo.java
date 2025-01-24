package Boletin_4_1.ArrayRectangulo.Class;

public class ArrayRectangulo {

    private double[] dimensiones;


    // creando el constructor


    public ArrayRectangulo(double[] dimensiones) {
        this.dimensiones = dimensiones;
    }

    public ArrayRectangulo() {
        this.dimensiones = new double[2]; //→ Predefinimos el array para que inicialice con tamaño 2
    }

    // m() para establecer valores


    /* metodo Setter, que recibe dos parámetros y los asigna al arreglo llamado dimensiones*/
    public void setDimensiones(double base, double altura) {
        this.dimensiones[0] = base;
        this.dimensiones[1] = altura;
    }

    //m() para obtener valores
    public double getBase() {
        return this.dimensiones[0];
    }

    public double getAltura() {
        return this.dimensiones[1];
    }

    // M() para calcular el área
    public double calcularArea() {
        return this.dimensiones[0] * this.dimensiones[1];
    }

    // M() para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * (this.dimensiones[0] + this.dimensiones[1]);
    }

    // M() para dibujar el rectángulo
    public void dibujarRectangulo() {
        int base = (int) this.dimensiones[0]; // Convertimos a enteros
        int altura = (int) this.dimensiones[1];

        if (base <= 1 || altura <= 1) {
            System.out.println("La base y la altura deben ser mayores a 1 positivos para dibujar el rectángulo.");
            return;
        }

        // Dibujar el rectángulo
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                // Pintar marco: primera y última fila, o primeras y últimas columnas
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("  "); // Espacios vacíos en el interior
                }
            }

            System.out.println(); // Salto de línea después de cada fila
        }
    }
}



