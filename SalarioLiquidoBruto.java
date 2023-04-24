package ImpostoDeRenda;
import java.util.Scanner;

public class SalarioLiquidoBruto {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    
    // Leitura do salário e dos benefícios
    double salarioBruto = input.nextDouble();
    double beneficios = input.nextDouble();
    
    double imposto = 0;
    //TODOImplemente as regras para o cálculo do imposto.
    imposto = salarioBruto * (salarioBruto <= 1100.00 ? 0.05 : salarioBruto > 2500.00 ? 0.15 : 0.10);
    
    // Cálculo do salário líquido
    double salarioLiquido = salarioBruto - imposto + beneficios;
    
    //TODOImprimir o salário líquido com 2 casas decimais.
    System.out.printf("%.2f", salarioLiquido);
    input.close();
  }
}


// SEGUNDA OPCAO TRADICIONAL
/*
if (salarioBruto <= 1100) {
         imposto = salarioBruto *0.05;
            salarioLiquido = salarioBruto - imposto + beneficios;
         
             System.out.printf("%.2f", salarioLiquido);

        } else if (salarioBruto >= 1100.01 && salarioBruto < 2500) {

            imposto = salarioBruto * 0.10;
            salarioLiquido = salarioBruto - imposto + beneficios;
              System.out.printf("%.2f", salarioLiquido);

        }
        else if (salarioBruto >= 2500) {

            imposto = salarioBruto * 0.15;
            salarioLiquido = salarioBruto - imposto + beneficios;
             System.out.printf("%.2f", salarioLiquido);

        }

*/  

