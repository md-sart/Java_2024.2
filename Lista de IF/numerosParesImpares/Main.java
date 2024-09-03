package numerosParesImpares;
import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2;

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = ler.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        num2 = ler.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Números pares entre " + num1 + " e " + num2 + ":");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNúmeros ímpares entre " + num1 + " e " + num2 + ":");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
