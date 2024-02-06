import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese un numero mayor o igual que cero: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("El numero ingresado es menor que cero. Por favor, intente de nuevo.");
            }
        } while (numero < 0);

        System.out.println("El numero ingresado es: " + numero);
        scanner.close();
    }
}
