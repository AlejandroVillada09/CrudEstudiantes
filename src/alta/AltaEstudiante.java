package alta;

import estudiante.Estudiante;
import input.Input;
import output.Output;
import java.util.Date;

public class AltaEstudiante {
    private Input input;
    private Output output;

    public AltaEstudiante() {
        this.input = new Input();
        this.output = new Output();
    }

    public Estudiante registrarEstudiante() {

        output.mostrarPregunta("\nIngrese el nombre completo del estudiante: ");
        String nombre = input.leerTexto();
        output.mostrarPregunta("\nIngrese el DNI del estudiante: ");
        String dni = input.leerTexto();
        output.mostrarPregunta("\nIngrese la edad del estudiante: ");
        int edad = Integer.parseInt(input.leerTexto());
        output.mostrarPregunta("\nIngrese la fecha de nacimiento del estudiante (año, mes, día): ");
        String[] fechaStr = input.leerTexto().split(",");
        int año = Integer.parseInt(fechaStr[0]);
        int mes = Integer.parseInt(fechaStr[1]) - 1;
        int dia = Integer.parseInt(fechaStr[2]);
        Date fechaNacimiento = new Date(año - 1900, mes, dia);

        Estudiante estudiante = new Estudiante(nombre, dni, edad, fechaNacimiento);

        return estudiante;
    }
}