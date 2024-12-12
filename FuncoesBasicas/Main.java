package FuncoesBasicas;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int TAM = 6;
    public static final Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetor = new int[TAM];
        int opcao;

        do {
            System.out.println("\n\nMENU");
            System.out.println("1 - Preencher vetor com valores aleatórios");
            System.out.println("2 - Inserir valores manualmente no vetor");
            System.out.println("3 - Ordenar vetor (Bubble Sort)");
            System.out.println("4 - Buscar valor no vetor");
            System.out.println("5 - Imprimir vetor");
            System.out.println("6 - Sair");
            System.out.print("Digite a sua opção: ");
            opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao) {
                case 1:
                    preencher(vetor);
                    System.out.println("Vetor preenchido com valores aleatórios.");
                    break;
                case 2:
                    inserirValoresUsuario(vetor);
                    System.out.println("Valores inseridos no vetor.");
                    break;
                case 3:
                    bubbleSort(vetor);
                    System.out.println("Vetor ordenado.");
                    break;
                case 4:
                    System.out.print("Digite o valor a ser buscado: ");
                    int valor = ler.nextInt();
                    int posicao = buscar(vetor, TAM, valor);
                    if (posicao != -1) {
                        System.out.println("Valor encontrado na posição: " + posicao);
                    } else {
                        System.out.println("Valor não encontrado.");
                    }
                    break;
                case 5:
                    imprimir(vetor);
                    break;
                case 6:
                    System.out.println("Encerrando o programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 6);
    }

    public static void bubbleSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
        System.out.println("Vetor após ordenação: ");
        imprimir(v);
    }

    public static void preencher(int[] v) {
        Random gerador = new Random();
        for (int i = 0; i < v.length; ++i) {
            v[i] = gerador.nextInt(100) + 1;
        }
    }

    public static void inserirValoresUsuario(int[] v) {
        for (int i = 0; i < v.length; ++i) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            v[i] = ler.nextInt();
        }
    }

    public static int buscar(int[] v, int tam, int valor) {
        for (int i = 0; i < tam; ++i) {
            if (v[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static void imprimir(int[] v) {
        System.out.print("{");
        if (v.length != 0) {
            System.out.print(v[0]);
            for (int i = 1; i < v.length; ++i) {
                System.out.print(", " + v[i]);
            }
        }
        System.out.println("}");
    }
}
