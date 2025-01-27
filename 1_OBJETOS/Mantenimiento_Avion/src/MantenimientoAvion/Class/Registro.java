package MantenimientoAvion.Class;

import java.time.LocalDate;
import java.time.Period;

public class Registro {
    private LocalDate fecha;
    private boolean estado;
    private Period periodoValidez;

    public Registro() {
        this.fecha = LocalDate.now();
        this.periodoValidez = Period.ofMonths(3); //Suponemos el rango de 3 meses el periodo válido, para que avión se le permita despegar
        this.estado = false; // por defecto el avión no puede despegar


    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Period getPeriodoValidez() {
        return periodoValidez;
    }

    public void setPeriodoValidez(Period periodoValidez) {
        this.periodoValidez = periodoValidez;
    }

    // M() para verificar si el avión puede o no volar
    public boolean puedeDespegar() {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaLimite = fecha.plus(periodoValidez);

        // Verificar si el avión está dentro del período de validez
        if (fechaActual.isBefore(fechaLimite)) {
            this.estado = true;
            return true;
        } else {
            this.estado = false;
            return false;
        }
    }
}

