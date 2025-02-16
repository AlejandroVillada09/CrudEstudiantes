package modificacion;

import estudiante.Estudiante;
import output.Output;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ModificarEstudiante {
    private Output output;
    private Scanner scanner;

    public ModificarEstudiante() {
        this.output = new Output();
        this.scanner = new Scanner(System.in);
    }

    public void modificarNota(ArrayList<Estudiante> estudiantes) {
        output.mostrarPregunta("\nSeleccione el estudiante a modificar: ");
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante estudiante = estudiantes.get(i);
            output.mostrarLista((i + 1) + ".| DNI: " + estudiante.getDni() + "| Nombre: " + estudiante.getNombreCompleto());
        }
        int indice = Integer.parseInt(scanner.nextLine()) - 1;
        Estudiante estudiante = estudiantes.get(indice);

        output.mostrarPregunta("\nIngrese la asignatura que desea modificar: ");
        String asignatura = scanner.nextLine();
        Estudiante.Asignatura asignaturaModificar = buscarAsignatura(estudiante.getAsignaturas(), asignatura);

        if (asignaturaModificar != null) {
            output.mostrarPregunta("\nIngrese la nueva nota (0-10): ");
            double nuevaNota = Double.parseDouble(scanner.nextLine());
            asignaturaModificar.setNota(nuevaNota);
            output.mostrarMensaje("\nNota actualizada correctamente.");
        } else {
            output.mostrarMensaje("\nAsignatura no encontrada.");
        }
    }

    private Estudiante.Asignatura buscarAsignatura(ArrayList<Estudiante.Asignatura> asignaturas, String asignatura) {
        Iterator<Estudiante.Asignatura> iterador = asignaturas.iterator();
        while (iterador.hasNext()) {
            Estudiante.Asignatura asig = iterador.next();
            if (asig.getNombre().equalsIgnoreCase(asignatura)) {
                return asig;
            }
        }
        return null;
    }
}
