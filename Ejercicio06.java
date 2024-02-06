import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double IVA = 0.10;
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        double precioFinal = precioProducto * (1 + IVA);

        System.out.println("El precio final con IVA es: " + precioFinal);
        scanner.close();
    }
}
