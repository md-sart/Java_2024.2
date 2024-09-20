import java.util.Scanner;

public class BuscaVetor {

    public static boolean estaOrdenado(int[] v) {
        for (int i = 1; i < v.length; i++) {
            if (v[i] < v[i - 1]) {
                return false; 
            }
        }
        return true;
    }

    public static int buscaSimples(int[] v, int x) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return i; 
            }
        }
        return -1; 
    }

    public static int buscaMelhorada(int[] v, int x) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return i;
            } else if (v[i] > x) {
                return -1; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10]; 

        System.out.println("Digite 10 valores para o vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        boolean ordenado = estaOrdenado(vetor);
        if (ordenado) {
            System.out.println("O vetor está ordenado.");
        } else {
            System.out.println("O vetor não está ordenado.");
        }

        char continuar;
        do {
            System.out.println("Digite um valor para buscar no vetor:");
            int x = scanner.nextInt();

            int posicao;
            if (ordenado) {
                posicao = buscaMelhorada(vetor, x);
            } else {
                posicao = buscaSimples(vetor, x);
            }

            if (posicao != -1) {
                System.out.println("Elemento encontrado na posição: " + posicao);
            } else {
                System.out.println("Elemento não encontrado.");
            }
            System.out.println("Deseja realizar outra busca? (s/n)");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
