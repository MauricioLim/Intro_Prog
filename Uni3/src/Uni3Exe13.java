/*
 * Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Faça um programa para ler o comprimento e altura de uma parede
 *  (em metros), e depois escrever o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.
 */

import java.util.Scanner;

public class Uni3Exe13 {
    public static double area(double altura, double comprimento) {
        return ((altura * comprimento) * 9 ) * 12.5 ;  
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Altura: ");
        double altura = teclado.nextDouble();

        System.out.print("Comprimento: ");
        double comprimento = teclado.nextDouble();

        System.out.printf("O valor gasto com a compra de azulejos é R$%.2f", area(altura, comprimento));

        teclado.close();
        
    }
}
