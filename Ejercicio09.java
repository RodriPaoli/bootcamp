import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Ejercicio 9
        String contraseña = "rodrigo";
        final int intentosMaximos = 3;
        int intentos = 0;
        while (intentos < intentosMaximos) {
            System.out.print("Introduce la contraseña: ");
            String intento = scanner.next();
            if (intento.equals(contraseña)) {
                System.out.println("Correcto!");
                break;
            } else {
                System.out.println("Contraseña incorrecta. Es el " + (intentos + 1) + " intento de " + intentosMaximos);
                intentos++;
            }
        }
        if (intentos == intentosMaximos) {
            System.out.println("Fallaste jaja!!");
        }
        scanner.close();
    }
}
