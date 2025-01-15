package Boletin_4_1.Rectangulo.Class;

/*Modelado de Rectángulo utilizando ARRAY*/

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    //M() calcular el AREA de rectágulo
    // formula [A = base * Altura]

    public double calcularArea(){
        return base * altura ;
    }


    //M() calcular el PERIMETRO de rectágulo
    // formula [ P = 2*(base + altura ]


    public double calcularPerimetro(){
        return 2*(base + altura);
    }


}
