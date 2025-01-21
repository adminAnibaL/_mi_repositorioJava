package Persona.Class;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private int dni;
    private char sexo;
    private double altura;
    private double peso;


    public Persona(String nombre, LocalDate fechaNacimiento, int dni, char sexo, double altura, double peso) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDni() {
        return dni+getLetraDni();
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

// m() para calcular el dni

    public char getLetraDni() {

        /* Calcula la letra del dni, la letra está determinada por el numero del DNI, se obitiene usando el resto
         * de la división, entre 23*/
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

        //Calculo letra ussando el resto de la división
        int indiceLetra = this.dni % 23;
        return letras[indiceLetra];


    }

    // M() para calcular el IMC
    public double getIMC() {
        // IMC = peso (kg) / (altura (m))^2
        return peso / (altura * altura);
    }

    @Override
    public String toString() {
        return ("La persona tiene los siguientes datos: \n" +
                  "El nombre es %s \n" +
                  "La fecha de nacimiento es %s \n" +
                  "El DNI es %s \n" +
                  "La altura es  %.2f \n" +
                  "El peso es %.2f").formatted(nombre,fechaNacimiento,getDni(),altura,peso);
    }
}

