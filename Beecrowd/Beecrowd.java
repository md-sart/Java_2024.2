import java.util.Scanner;

public class Beecrowd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] resultado = new int[20];  // Vetor resultado de tamanho 20

        // Lendo o primeiro vetor
        System.out.println("Digite os valores do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = sc.nextInt();
        }

        // Lendo o segundo vetor
        System.out.println("Digite os valores do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = sc.nextInt();
        }

        // Construindo o vetor resultado
        for (int i = 0; i < 10; i++) {
            resultado[2 * i] = vetor2[i];     // Posições pares recebem valores do segundo vetor
            resultado[2 * i + 1] = vetor1[i]; // Posições ímpares recebem valores do primeiro vetor
        }

        // Exibindo o vetor resultado
        System.out.println("Vetor resultante:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Posição " + i + ": " + resultado[i]);
        }

        sc.close();
    }
}
