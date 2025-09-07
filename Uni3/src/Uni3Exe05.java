/*
 * Uma granja possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel com um chip
 *  de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel 
 * com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um programa para calcular o gasto total da granja para 
 * marcar todos os seus frangos.
 *  */

import java.util.Scanner;
public class Uni3Exe05 {

    public static double total(int qtd) {
        return (3.5 * 2 + 4) * qtd;
    }


    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        int qtd = teclado.nextInt();
        System.out.printf("O gasto total para marcar" + qtd + "é  R$%.2f\n", total(qtd));


        teclado.close();
    }
}
