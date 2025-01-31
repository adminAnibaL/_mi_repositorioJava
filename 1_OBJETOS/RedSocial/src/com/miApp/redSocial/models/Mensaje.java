package com.miApp.redSocial.models;

import java.util.Objects;

public class Mensaje {
    private String mensaje;
    private boolean estado;

    public Mensaje(String mensaje, boolean estado) {
        this.mensaje = mensaje;
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mensaje mensaje1 = (Mensaje) o;
        return estado == mensaje1.estado && Objects.equals(mensaje, mensaje1.mensaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mensaje, estado);
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "mensaje='" + mensaje + '\'' +
                ", estado=" + estado +
                '}';
    }

}
