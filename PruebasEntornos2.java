package pruebasentornos2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PruebasEntornos2 {

    static int maximo(int a, int b) {
        int max;
        if (a < b) {
            max = b;
        } else {
            max = a;
        }
        return (max);
    }

    public static void main(String[] args) {
        int max;
        int a, b;
        System.out.print("Introduce un n�mero:: ");
        a = Entrada.entero();
        System.out.print("Introduce otro n�mero:: ");
        b = Entrada.entero();
        max = maximo(a, b);
        System.out.println("El n�mero mayor es: " + max);
    }
}
