package estudiante;

import java.util.ArrayList;
import java.util.Date;

public class Estudiante {
    private String nombreCompleto;
    private String dni;
    private int edad;
    private Date fechaNacimiento;
    private ArrayList<Asignatura> asignaturas;

    public Estudiante(String nombreCompleto, String dni, int edad, Date fechaNacimiento) {

        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.asignaturas = new ArrayList<>();
    }

    public void agregarAsignatura(String asignatura, double nota) {
        this.asignaturas.add(new Asignatura(asignatura, nota));
    }

    public String getDni() {
        return dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public static class Asignatura {
        private String nombre;
        private double nota;

        public Asignatura(String nombre, double nota) {
            this.nombre = nombre;
            this.nota = nota;
        }

        public String getNombre() {
            return nombre;
        }

        public double getNota() {
            return nota;
        }

        public void setNota(double nota) {
            this.nota = nota;
        }
    }
}