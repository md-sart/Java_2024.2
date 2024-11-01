package VetoresOrdenados;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {

        int[] v = new int[50];

        preencherVetorAleatorio(v);
        ordenarBubbleSort(v);
        imprimirMenorEMaior(v);
        double mediana = calcularMediana(v);
        System.out.println("Mediana: " + mediana);
        contarValor(v);
        int[] vetorSemRepeticao = criarVetorSemRepeticao(v);
        System.out.print("Vetor sem valores repetidos: ");
        imprimirVetor(vetorSemRepeticao);
    }
    
    // Função para preencher o vetor com valores aleatórios entre 1 e 10
    public static void preencherVetorAleatorio(int[] v) {
        Random random = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(10) + 1;
        }
        System.out.print("Vetor preenchido com valores aleatórios: ");
        imprimirVetor(v);
    }
    
    // Função para ordenar o vetor usando Bubble Sort
    public static void ordenarBubbleSort(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
        System.out.print("Vetor ordenado: ");
        imprimirVetor(v);
    }
    
    // Função para imprimir o menor e o maior valor do vetor
    public static void imprimirMenorEMaior(int[] v) {
        int menorValor = v[0];
        int maiorValor = v[v.length - 1];
        
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);
    }
    
    // Função para calcular a mediana do vetor 
    public static double calcularMediana(int[] v) {
        int meio = v.length / 2;
        if (v.length % 2 == 0) {
            return (v[meio - 1] + v[meio]) / 2.0;
        } else {
            return v[meio];
        }
    }
    
    // Função para contar as ocorrências de cada valor no vetor e imprimir
    public static void contarValor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            int count = 1;
            while (i < v.length - 1 && v[i] == v[i + 1]) {
                count++;
                i++;
            }
            System.out.println("Valor: " + v[i] + " - Quantidade: " + count);
        }
    }
    
    // Função para criar um vetor sem valores repetidos
    public static int[] criarVetorSemRepeticao(int[] v) {
        int uniqueCount = 0;
        
        for (int i = 0; i < v.length; i++) {
            uniqueCount++;
            while (i < v.length - 1 && v[i] == v[i + 1]) {
                i++;
            }
        }
        
        int[] uniqueValues = new int[uniqueCount];
        int index = 0;
        
        for (int i = 0; i < v.length; i++) {
            uniqueValues[index++] = v[i];
            while (i < v.length - 1 && v[i] == v[i + 1]) {
                i++;
            }
        }
        
        return uniqueValues;
    }
    
    // Função para imprimir o vetor 
    public static void imprimirVetor(int[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}