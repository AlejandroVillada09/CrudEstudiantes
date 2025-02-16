package baja;

import estudiante.Estudiante;
import output.Output;
import java.util.ArrayList;
import java.util.Iterator;

public class BajaEstudiante {
    private Output output;

    public BajaEstudiante() {
        this.output = new Output();
    }

    public void eliminarEstudiante(ArrayList<Estudiante> estudiantes) {
        output.mostrarPregunta("\nSeleccione el número del estudiante a eliminar: ");

        int i = 1;
        Iterator<Estudiante> iterador = estudiantes.iterator();
        while (iterador.hasNext()) {
            Estudiante estudiante = iterador.next();
            output.mostrarLista("\n" + i + ".| DNI: " + estudiante.getDni() + "| Nombre: " + estudiante.getNombreCompleto());
            i++;
        }

        int indice = Integer.parseInt(new java.util.Scanner(System.in).nextLine()) - 1;

        i = 0;
        iterador = estudiantes.iterator();
        while (iterador.hasNext()) {
            Estudiante estudiante = iterador.next();
            if (i == indice) {
                iterador.remove();
                output.mostrarMensaje("\nEstudiante eliminado correctamente.");
                return;
            }
            i++;
        }
    }
}