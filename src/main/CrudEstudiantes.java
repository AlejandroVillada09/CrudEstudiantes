package main;

import alta.AltaEstudiante;
import baja.BajaEstudiante;
import input.Input;
import modificacion.ModificarEstudiante;
import lista.ListaEstudiantes;
import estudiante.Estudiante;
import output.Output;
import java.util.ArrayList;

public class CrudEstudiantes {

    public static final int ALTA = 1;
    public static final int BAJA = 2;
    public static final int MODIFICAR = 3;
    public static final int LISTA = 4;
    public static final int SALIR = 5;

    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        AltaEstudiante altaEstudiante = new AltaEstudiante();
        BajaEstudiante bajaEstudiante = new BajaEstudiante();
        ModificarEstudiante modificarEstudiante = new ModificarEstudiante();
        ListaEstudiantes listaEstudiantes = new ListaEstudiantes();
        Output output = new Output();
        Input input = new Input();

        boolean salir = false;

        do {
            output.mostrarPregunta("\n1. Alta de estudiante\n2. Baja de estudiante\n3. Modificar estudiante\n4. Listar estudiantes\n5. Salir" +
                    "\n\nDigite una de las opciones del menu: ");
            int opcion = Integer.parseInt(new java.util.Scanner(System.in).nextLine());

            switch (opcion) {
                case ALTA:
                    Estudiante nuevoEstudiante = altaEstudiante.registrarEstudiante();
                    estudiantes.add(nuevoEstudiante);
                    break;
                case BAJA:
                    bajaEstudiante.eliminarEstudiante(estudiantes);
                    break;
                case MODIFICAR:
                    modificarEstudiante.modificarNota(estudiantes);
                    break;
                case LISTA:
                    listaEstudiantes.listarEstudiantes(estudiantes);
                    break;
                case SALIR:
                    salir = true;
                    break;
                default:
                    output.mostrarMensaje("\nOpción no válida.");
            }
        } while (!salir);
    }
}
