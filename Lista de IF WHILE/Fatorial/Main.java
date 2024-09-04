package Fatorial;
import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite um número inteiro positivo: ");
        int numero = ler.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! Por favor, insira um número inteiro positivo.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }

    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}
