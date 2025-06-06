package ups.edu.ec.poo;

import java.util.ArrayList;

public class Estudiante {
    private int id;
    private String nombre;
    private ArrayList<Calificacion> calificaciones;

    public Estudiante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void agregarCalificacion(Calificacion calificacion) {
        calificaciones.add(calificacion);
    }

    public ArrayList<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + " (ID: " + id + "), Calificaciones: " + calificaciones.size();
    }
}
