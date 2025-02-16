package lista;

import estudiante.Estudiante;
import output.Output;
import java.util.ArrayList;

public class ListaEstudiantes {
    private Output output;

    public ListaEstudiantes() {
        this.output = new Output();
    }

    public void listarEstudiantes(ArrayList<Estudiante> estudiantes) {
        output.mostrarPregunta("\nLista de estudiantes: ");
        for (Estudiante estudiante : estudiantes) {
            output.mostrarLista("\nDNI: " + estudiante.getDni() + "| Nombre: " + estudiante.getNombreCompleto());
            for (Estudiante.Asignatura asignatura : estudiante.getAsignaturas()) {
                output.mostrarLista("\n| Asignatura: " + asignatura.getNombre() + "| Nota: " + asignatura.getNota());
            }
        }
    }
}