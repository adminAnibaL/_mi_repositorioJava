package com.miapp.utils;

import com.miapp.models.FigurasMadera;

import java.time.LocalDate;


public class FuncionCreacionObjetos {

    // funcion para crear una figura de madera


    public static void crearFiguraMadera() {


        String nombre = ConsoleInput.solicitarCadena("Ingrese el [nombre] de la figura nueva");
        String marca = ConsoleInput.solicitarCadena("Ingrese el [marca] de la figura nueva");
        String descripcion = ConsoleInput.solicitarCadena("Ingrese el [descripcion] de la figura nueva");
        String origen = ConsoleInput.solicitarCadena("Ingrese el [origen] de la figura nueva");
        LocalDate fecha = ConsoleInput.solicitarFecha("Ingrese la fecha de la tala");
        String color = ConsoleInput.solicitarCadena("Ingrese el [color] de la figura nueva");
        int numLados = ConsoleInput.solicitarEntero("Ingrese el [numLados] de la figura");

        FigurasMadera figurasMadera1 = new FigurasMadera(nombre, marca, descripcion, origen, fecha, color, numLados);



    }


}
