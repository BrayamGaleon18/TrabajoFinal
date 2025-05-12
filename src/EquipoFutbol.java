public class EquipoFutbol {

    protected String nombre;


    public EquipoFutbol() {
    }

    public EquipoFutbol(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "EquipoFutbol{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public void mostrarEstadisticas() {

    }
}





















