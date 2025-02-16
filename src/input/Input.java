package input;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String leerTexto() {
        return scanner.nextLine();
    }
}