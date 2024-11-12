package AlgoritmosOrdenacao;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] tamanhos = {10, 100, 1000, 10000, 100000, 500000}; 
        SortingBenchmark.realizarTestes(tamanhos);
    }
}

class SortingBenchmark {

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
    }

    public static void insertionSort(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int key = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > key) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = key;
        }
    }

    public static void selectionSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = v[minIndex];
            v[minIndex] = v[i];
            v[i] = temp;
        }
    }

    public static int[] gerarVetorAleatorio(int tamanho) {
        Random random = new Random();
        int[] v = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            v[i] = random.nextInt(100);
        }
        return v;
    }

    public static int[] gerarVetorOrdenado(int tamanho) {
        int[] v = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            v[i] = i;
        }
        return v;
    }

    public static int[] gerarVetorOrdenadoDecrescente(int tamanho) {
        int[] v = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            v[i] = tamanho - i;
        }
        return v;
    }

    public static long medirTempoExecucao(Runnable algoritmo) {
        long inicio = System.currentTimeMillis();
        algoritmo.run();
        long fim = System.currentTimeMillis();
        return fim - inicio;
    }

    public static void realizarTestes(int[] tamanhos) {
        for (int tamanho : tamanhos) {
            System.out.println("Tamanho do vetor: " + tamanho);

            int[] vetorAleatorio = gerarVetorAleatorio(tamanho);
            int[] vetorOrdenado = gerarVetorOrdenado(tamanho);
            int[] vetorOrdenadoDesc = gerarVetorOrdenadoDecrescente(tamanho);

            System.out.println("Bubble Sort:");
            long tempoBubbleAleatorio = medirTempoExecucao(() -> bubbleSort(Arrays.copyOf(vetorAleatorio, vetorAleatorio.length)));
            long tempoBubbleOrdenado = medirTempoExecucao(() -> bubbleSort(Arrays.copyOf(vetorOrdenado, vetorOrdenado.length)));
            long tempoBubbleDesc = medirTempoExecucao(() -> bubbleSort(Arrays.copyOf(vetorOrdenadoDesc, vetorOrdenadoDesc.length)));
            System.out.println("Aleatório: " + tempoBubbleAleatorio + "ms, Ordenado: " + tempoBubbleOrdenado + "ms, Decrescente: " + tempoBubbleDesc + "ms");

            System.out.println("Insertion Sort:");
            long tempoInsertionAleatorio = medirTempoExecucao(() -> insertionSort(Arrays.copyOf(vetorAleatorio, vetorAleatorio.length)));
            long tempoInsertionOrdenado = medirTempoExecucao(() -> insertionSort(Arrays.copyOf(vetorOrdenado, vetorOrdenado.length)));
            long tempoInsertionDesc = medirTempoExecucao(() -> insertionSort(Arrays.copyOf(vetorOrdenadoDesc, vetorOrdenadoDesc.length)));
            System.out.println("Aleatório: " + tempoInsertionAleatorio + "ms, Ordenado: " + tempoInsertionOrdenado + "ms, Decrescente: " + tempoInsertionDesc + "ms");

            System.out.println("Selection Sort:");
            long tempoSelectionAleatorio = medirTempoExecucao(() -> selectionSort(Arrays.copyOf(vetorAleatorio, vetorAleatorio.length)));
            long tempoSelectionOrdenado = medirTempoExecucao(() -> selectionSort(Arrays.copyOf(vetorOrdenado, vetorOrdenado.length)));
            long tempoSelectionDesc = medirTempoExecucao(() -> selectionSort(Arrays.copyOf(vetorOrdenadoDesc, vetorOrdenadoDesc.length)));
            System.out.println("Aleatório: " + tempoSelectionAleatorio + "ms, Ordenado: " + tempoSelectionOrdenado + "ms, Decrescente: " + tempoSelectionDesc + "ms");
        }
    }
}
