package IMC;
import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args){
        double peso;
        double altura;
        double imc;

        System.out.print("Digite seu peso: ");
        peso = ler.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = ler.nextDouble();

        // Cálculo do IMC: peso / (altura * altura)
        imc = peso / (altura * altura);

        // Exibe o resultado do IMC
        System.out.println("Seu IMC é: " + imc);

        // Classificação do IMC
        if (imc < 18.5) {
            System.out.println("Você está baixo do peso normal");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Você está com peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você está com excesso de peso");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Você está com obesidade grau I");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Você está com obesidade grau II");
        } 
        else {
            System.out.println("Você está com obesidade grau III");
        }
    }
}
