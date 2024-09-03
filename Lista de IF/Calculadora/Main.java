package Calculadora;
import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args){
        int num1;
        int num2;
        String operacao;
        int resultado = 0;
        System.out.print("Digite o primeiro numero: ");
        num1 = ler.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = ler.nextInt();
        System.out.print("Escolha a operacao (+ ou - ou * ou / ): ");
        operacao = ler.next();
        

        if (operacao.equals("+")){
            resultado = num1 + num2;
        } else if (operacao.equals("-")){
            resultado = num1 - num2;
        } else if (operacao.equals("*")){
            resultado = num1 * num2;
        } else if (operacao.equals("/")){
            resultado = num1 / num2;
        } else {
            System.out.println("Opcao inválida!");
        }

        System.out.println("O resultado é: " + resultado);
        
    }
}