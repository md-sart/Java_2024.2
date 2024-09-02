import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args){
    int idade;
    System.out.print("Digite sua idade: ");
    idade = ler.nextInt();
    System.out.println("Sua idade é" + idade);
    }

}