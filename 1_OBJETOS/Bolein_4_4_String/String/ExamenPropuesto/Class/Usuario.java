package String.ExamenPropuesto.Class;

public class Usuario {

    private String nombre;
    private String apellido;
    private int numFavorito;

    public Usuario(String nombre, String apellido, int numFavorito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numFavorito = numFavorito;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumFavorito() {
        return numFavorito;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numFavorito=" + numFavorito +
                '}';
    }
}
