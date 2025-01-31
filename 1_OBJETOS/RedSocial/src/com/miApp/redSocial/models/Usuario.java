package com.miApp.redSocial.models;

import com.miApp.redSocial.utils.MensajeException;

import java.util.Objects;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                '}';
    }


    public static void agregarAmigo(Usuario usuario) {

    }

    public static void publicarMensaje(String mensaje, Boolean estado) throws MensajeException {

    }

    public static void darLike(){}

    public static void verMensajes(Usuario usuario) {

    }

}
