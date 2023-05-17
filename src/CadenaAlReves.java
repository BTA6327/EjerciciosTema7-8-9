import java.util.Scanner;

public class CadenaAlReves {
    public static void main(String[] args) {

        System.out.println("******************\n Cadena al Reves\n******************");

        Scanner scanner = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce una palabra: ");
        cadena = scanner.nextLine();

        StringBuilder reves = new StringBuilder(cadena);
        cadena = reves.reverse().toString();

        System.out.println(cadena);
    }
}
