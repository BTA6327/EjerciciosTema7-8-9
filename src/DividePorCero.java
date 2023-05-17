import java.util.Scanner;

public class DividePorCero {
    private static int Divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {

        System.out.println("******************** \n División por cero\n********************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los numeros a dividir: ");
        System.out.print("Numero 1: ");
        int a = scanner.nextInt();
        System.out.print("Numero 2: ");
        int b = scanner.nextInt();
        try {
            System.out.println("Resultado: " + Divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Finalizado");
        }
    }
}

