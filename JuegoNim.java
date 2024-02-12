package Dia4;
import java.util.Scanner;

public class JuegoNim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pilas = {3, 3, 3};
        int jugadorActual = 1;

        while (true) {
            System.out.println("Estado actual de las pilas:");
            for (int i = 0; i < pilas.length; i++) {
                System.out.print("Pila " + (i + 1) + ": ");
                for (int j = 0; j < pilas[i]; j++) {
                    System.out.print("| ");
                }
                System.out.println();
            }

            System.out.println("Turno del jugador " + jugadorActual);

            System.out.print("Elija una pila (1, 2 o 3): ");
            int pila = scanner.nextInt() - 1;
            System.out.print("Ingrese la cantidad de contadores a quitar: ");
            int cantidad = scanner.nextInt();

            while (pila < 0 || pila >= pilas.length || cantidad <= 0 || cantidad > pilas[pila]) {
                System.out.println("Movimiento inválido. Inténtelo de nuevo.");
                System.out.print("Elija una pila (1, 2 o 3): ");
                pila = scanner.nextInt() - 1;
                System.out.print("Ingrese la cantidad de contadores a quitar: ");
                cantidad = scanner.nextInt();
            }


            pilas[pila] -= cantidad;

            if (esFinJuego(pilas)) {
                System.out.println("El jugador " + jugadorActual + " ha quitado el último contador. Perdio! :(");
                break;
            }

            jugadorActual = jugadorActual == 1 ? 2 : 1;
        }

        scanner.close();
    }

    public static boolean esFinJuego(int[] pilas) {
        for (int contador : pilas) {
            if (contador > 0) {
                return false;
            }
        }
        return true;
    }
}





