/*Uni2Exe07 [1][1009]
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de 
vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor
 ganha 15% de comissão sobre suas vendas efetuadas, 
informar o total a receber no final do mês, com duas casas decimais.*/

import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o nome do vendedor: ");
        String vendedor = teclado.nextLine();

        System.out.print("Informe o salario: R$");
        float salario = teclado.nextFloat();

        System.out.print("Informe a quantidade de vendas no mes: R$");
        int vendas = teclado.nextInt();

        System.out.printf("O vendedor " + vendedor + " ira receber R$%.2f%n", ((vendas * 0.15) + salario ));

        teclado.close();        
    }
    
}
//TESTE DE MESA
//Se o salario por mes é R$1000 e o total de vendas for R$100 o valor a ser mostrado deve ser R$1015