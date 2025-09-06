/*
 *  Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa que leia o peso do prato montado 
 * pelo cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas. 
*/

import java.util.Scanner;
public class Uni3Exe01 {

    public static double valar(double qtd) {
        return (qtd - 0.75) * 25;
    }


    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        double qtd = teclado.nextDouble();
    
        System.out.printf("O valor do prato do cliente é R$%.2f\n", valar(qtd));

        teclado.close();
    }
}
