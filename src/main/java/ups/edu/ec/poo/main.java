package ups.edu.ec.poo;

public class main {
    public static void main(String[] args) {
        Asignatura mate = new Asignatura("Matemáticas", "MAT101");
        Asignatura historia = new Asignatura("Historia", "HIS201");

        Estudiante est1 = new Estudiante(1, "Ana López");
        Estudiante est2 = new Estudiante(2, "Carlos Pérez");

        Calificacion cal1 = new Calificacion(9.5, mate);
        Calificacion cal2 = new Calificacion(8.0, historia);

        Calificacion cal3 = new Calificacion(7.5, mate);
        Calificacion cal4 = new Calificacion(9.0, historia);

        est1.agregarCalificacion(cal1);
        est1.agregarCalificacion(cal2);

        est2.agregarCalificacion(cal3);
        est2.agregarCalificacion(cal4);

        Curso curso = new Curso("Primer Curso", "CUR123");
        curso.agregarEstudiante(est1);
        curso.agregarEstudiante(est2);

        System.out.println(curso);

        for (Estudiante e : curso.getEstudiantes()) {
            System.out.println(e);
            for (Calificacion c : e.getCalificaciones()) {
                System.out.println("  - " + c);
            }
        }
    }
}
