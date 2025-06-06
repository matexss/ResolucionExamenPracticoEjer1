package ups.edu.ec.poo;

import java.util.ArrayList;

public class Curso {
    private String nombre;
    private String codigo;
    private ArrayList<Estudiante> estudiantes;

    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public ArrayList<Estudiante> getEstudiantes() { return estudiantes; }
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "Curso: " + nombre + " (" + codigo + "), Estudiantes: " + estudiantes.size();
    }
}
