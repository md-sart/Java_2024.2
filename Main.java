/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void umACem() {
        StringBuilder numeros = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            numeros.append(i);
            if (i < 100) {
                numeros.append(", ");
            }
        }
        System.out.println(numeros.toString());
    }

    public static void somarImpares() {
        int soma = 0;
        for (int i = 11; i < 1000; i += 2) {
            soma += i;
        }
        System.out.println("O somatório de todos os números ímpares entre 10 e 1000 é: " + soma);
    }

    public static void multiplosDe3SemTerminarEm3() {
        StringBuilder numeros = new StringBuilder();
        for (int i = 3; i < 1000; i += 3) {
            if (i % 10 != 3) {
                numeros.append(i);
                if (i < 999 - (999 % 3)) { 
                    numeros.append(", ");
                }
            }
        }
        System.out.println(numeros.toString());
    }

   
    public static void main(String[] args) {
        System.out.println("Números de 1 a 100:");
        umACem();
        
        System.out.println("\nSomatório de todos os números ímpares entre 10 e 1000:");
        somarImpares();
        
        System.out.println("\nMúltiplos de 3 que não terminam em 3:");
        multiplosDe3SemTerminarEm3();
    }
}
