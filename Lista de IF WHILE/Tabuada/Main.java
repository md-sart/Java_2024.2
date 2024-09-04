package Tabuada;
import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite um número inteiro: ");
        int numero = ler.nextInt();
        
        exibirTabuada(numero, 1); 
    }

    public static void exibirTabuada(int numero, int multiplicador) {
        if (multiplicador > 10) {
        } else {
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
            exibirTabuada(numero, multiplicador + 1); 
        }
    }
}
