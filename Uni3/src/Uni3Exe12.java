/*
 * Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. A empresa 
 * paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) e 
 * são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. 
 * Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe12 {

    public static double salario(int horas) {
        return (horas * 10); //+ (dependentes * 60);
    }

    public static double desconto(int horas) {
        return (salario(horas) * 0.05) + (salario(horas) * 0.085);
    }

        public static void main(String[] args) throws Exception {
            Scanner teclado = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("###,##0.00");

            System.out.print("Nome: ");
            String nome = teclado.nextLine();

            System.out.print("Quantidade de horas trabalhadas no mês: ");
            int horas = teclado.nextInt();

            System.out.print("Número de dependentes: ");
            int dependentes = teclado.nextInt();

            System.out.print("O funcionario " + nome + " possui um salário bruto de R$" + df.format(salario(horas) + (dependentes * 60)) + " e um salário líquido de R$" + df.format((salario(horas) - desconto(horas)) + (dependentes * 60)) + "\n");


            teclado.close();
        }
    
}
