package VetoresOrdenados;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void Scanner ler = new Scanner(System.in);
    int v = new int [50];
    }

//Crie um vetor de tamanho 50 e preencha com valores aleatórios entre 1 e 10
public static void vetorAleatorio(int [] v){
    Random random = new Random();
        for (int i= 1; i<v.length; i++){
            v[i] = random.nextInt(10)+1;
        }

}

//Ordene esse vetor utilizando o algoritmo do bubble sort
public static void vetorAleatorio(int [] v){
    for (int i = 0; i<v.length; i++){
        for (int j = 0; j<v.length -1; j++){
            if (v[j] > v[j + 1]){
                int temp = v[j];
                v[j] = v[j+1];
                v[j+1] = temp;
            }
        }

    }
}

//Imprima o menor e maior valor deste vetor (OBS: não pode utilizar nenhum comando de repetição (laço) nesta questão)


//Imprima a mediana deste vetor (OBS: não pode utilizar nenhum comando de repetição (laço) nesta questão)
//Imprima uma listagem onde cada linha tem um valor que está no vetor e a quantidade de vezes que esse valor aparece no vetor
//Crie um novo vetor que não tenha valores repetidos (OBS: você deve criar esse vetor do tamanho exato necessário)