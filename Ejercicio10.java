import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Ejercicio 10
        System.out.print("Ingrese un día de la semana: ");
        String dia = scanner.nextLine();
        String[] diasLaborables = {"lunes", "martes", "miercoles", "jueves", "viernes"};

        for (int i = 0; i < 4; i++) {
            dia.equals(diasLaborables[i]);
            System.out.println(dia + " es un dia laborable");
            break;
        }
        scanner.close();
    }
}
