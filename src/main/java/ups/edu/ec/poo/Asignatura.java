package ups.edu.ec.poo;

public class Asignatura {
    private String nombre;
    private String codigo;

    public Asignatura(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    @Override
    public String toString() {
        return "Asignatura: " + nombre + " (" + codigo + ")";
    }
}
