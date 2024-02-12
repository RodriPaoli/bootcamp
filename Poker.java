package Dia5;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


class Carta {
    private char valor;
    private char palo;

    public Carta(char valor, char palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public char getValor() {
        return valor;
    }

    public char getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return valor + "" + palo;
    }
}

public class Poker {

    public static void main(String[] args) {
        Carta[] mano = generarManoAleatoria();

        System.out.print("Mano generada aleatoriamente: ");
        for (Carta carta : mano) {
            System.out.print(carta + ", ");
        }

        System.out.println();

        if (esEscaleraColor(mano)) {
            System.out.println("Escalera de Color");
        } else if (esPoker(mano)) {
            System.out.println("Poker");
        } else if (esFull(mano)) {
            System.out.println("Full");
        } else if (esColor(mano)) {
            System.out.println("Color");
        } else if (esEscalera(mano)) {
            System.out.println("Escalera");
        } else if (esTrio(mano)) {
            System.out.println("Trío");
        } else if (esParDoble(mano)) {
            System.out.println("Par Doble");
        } else if (esPar(mano)) {
            System.out.println("Par");
        } else {
            System.out.println("Carta Alta");
        }
    }

    public static Carta[] generarManoAleatoria() {
        Carta[] mano = new Carta[5];
        Random random = new Random();
        String valores = "A23456789TJQK";
        String palos = "SCHD";
        Set<String> cartasElegidas = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            String cartaActual;
            do {
                char valor = valores.charAt(random.nextInt(valores.length()));
                char palo = palos.charAt(random.nextInt(palos.length()));
                cartaActual = valor + "" + palo;
            } while (cartasElegidas.contains(cartaActual));

            cartasElegidas.add(cartaActual);
            mano[i] = new Carta(cartaActual.charAt(0), cartaActual.charAt(1));
        }

        return mano;
    }

    public static Map<Character, Integer> contarValores(Carta[] mano) {
        Map<Character, Integer> conteo = new HashMap<>();
        for (Carta carta : mano) {
            char valor = carta.getValor();
            conteo.put(valor, conteo.getOrDefault(valor, 0) + 1);
        }
        return conteo;
    }

    public static boolean esEscaleraColor(Carta[] mano) {
        return esEscalera(mano) && esColor(mano);
    }

    public static boolean esPoker(Carta[] mano) {
        Map<Character, Integer> conteo = contarValores(mano);
        for (int valor : conteo.values()) {
            if (valor == 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean esFull(Carta[] mano) {
        Map<Character, Integer> conteo = contarValores(mano);
        boolean tieneTrio = false;
        boolean tienePar = false;
        for (int valor : conteo.values()) {
            if (valor == 3) {
                tieneTrio = true;
            } else if (valor == 2) {
                tienePar = true;
            }
        }
        return tieneTrio && tienePar;
    }

    public static boolean esColor(Carta[] mano) {
        char primerPalo = mano[0].getPalo();
        for (int i = 1; i < mano.length; i++) {
            if (mano[i].getPalo() != primerPalo) {
                return false;
            }
        }
        return true;
    }

    public static boolean esEscalera(Carta[] mano) {
        Arrays.sort(mano, (a, b) -> a.getValor() - b.getValor());
        for (int i = 0; i < mano.length - 1; i++) {
            if (mano[i + 1].getValor() - mano[i].getValor() != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean esTrio(Carta[] mano) {
        Map<Character, Integer> conteo = contarValores(mano);
        for (int valor : conteo.values()) {
            if (valor == 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean esParDoble(Carta[] mano) {
        Map<Character, Integer> conteo = contarValores(mano);
        int pares = 0;
        for (int valor : conteo.values()) {
            if (valor == 2) {
                pares++;
            }
        }
        return pares == 2;
    }

    public static boolean esPar(Carta[] mano) {
        Map<Character, Integer> conteo = contarValores(mano);
        for (int valor : conteo.values()) {
            if (valor == 2) {
                return true;
            }
        }
        return false;
    }

}
