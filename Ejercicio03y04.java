import java.util.Objects;
import java.util.Scanner;

public class Ejercicio03y04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = "Rodrigo";
        String nombreIngresado = scanner.next();
        if (Objects.equals(nombre,nombreIngresado)){
            System.out.println("Bienvenido Rodrigo");
        } else {
            System.out.println("Fuera extraño");
        }
        scanner.close();
    }
}
