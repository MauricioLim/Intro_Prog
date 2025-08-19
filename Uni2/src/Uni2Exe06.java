//Uni2Exe06 [1][1008]
//Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
//o valor que recebe por hora e calcula o salário desse funcionário.
//A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

import java.util.Scanner;

public class Uni2Exe06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o número do funcionario: ");
        int funcionario = teclado.nextInt();
        System.out.print("Informe o número de horas trabalhadas: ");
        float horas = teclado.nextFloat();
        System.out.print("Informe o que recebido por hora: ");
        float valor = teclado.nextFloat();

        System.out.printf("O funcionario " + funcionario + " receve por mes R$%.2f%n", (horas * valor));

        teclado.close();

        //TESTE DE MESA 
        //Se o funcionario trablhou 2 hrs e recebe 10 reais a hora ele irá receber R$20
    }
}
