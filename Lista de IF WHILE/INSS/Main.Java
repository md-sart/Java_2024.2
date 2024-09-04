package INSS;
import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args){
        double salarioBruto;
        double inss = 0.0;
        double salarioLiquido;

        System.out.print("Digite seu salário bruto: ");
        salarioBruto = ler.nextDouble();

        if (salarioBruto <= 1320.00) {
            inss = salarioBruto * 0.075; // 7.5%
        } else if (salarioBruto <= 2571.29) {
            inss = 1320.00 * 0.075 + (salarioBruto - 1320.00) * 0.09; 
        } else if (salarioBruto <= 3856.94) {
            inss = 1320.00 * 0.075 + (2571.29 - 1320.00) * 0.09 + (salarioBruto - 2571.29) * 0.12;
        } else if (salarioBruto <= 7507.49) {
            inss = 1320.00 * 0.075 + (2571.29 - 1320.00) * 0.09 + (3856.94 - 2571.29) * 0.12 + (salarioBruto - 3856.94) * 0.14; 
        } else {
            inss = 1320.00 * 0.075 + (2571.29 - 1320.00) * 0.09 + (3856.94 - 2571.29) * 0.12 + (7507.49 - 3856.94) * 0.14; 
        }

        salarioLiquido = salarioBruto - inss;

        System.out.println("Valor da contribuição ao INSS: R$ " + inss));
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}