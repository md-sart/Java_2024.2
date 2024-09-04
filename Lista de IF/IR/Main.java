package IR;
import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args){
        double salarioBruto;
        double irrf = 0.0;
        double salarioLiquido;
        double deducaoDependente = 189.59; 
        int numeroDependentes;

        System.out.print("Digite seu salário bruto: ");
        salarioBruto = ler.nextDouble();

        System.out.print("Digite o número de dependentes: ");
        numeroDependentes = ler.nextInt();

       
        double salarioBaseIRRF = salarioBruto - (numeroDependentes * deducaoDependente);

        
        if (salarioBaseIRRF <= 1903.98) {
            irrf = 0.0; 
        } else if (salarioBaseIRRF <= 2826.65) {
            irrf = (salarioBaseIRRF - 1903.98) * 0.075 - 142.80; 
        } else if (salarioBaseIRRF <= 3751.05) {
            irrf = (salarioBaseIRRF - 2826.65) * 0.15 - 354.80;
        } else if (salarioBaseIRRF <= 4664.68) {
            irrf = (salarioBaseIRRF - 4664.68) * 0.275 - 869.36; 
        }

        salarioLiquido = salarioBruto - irrf;

        System.out.println("Valor do Imposto de Renda Retido na Fonte: R$ " + irrf);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}
