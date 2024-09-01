package modificacion;

public class modificacion {
    private String descripcion;

    public modificacion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Modificación: " + descripcion;
    }
}
