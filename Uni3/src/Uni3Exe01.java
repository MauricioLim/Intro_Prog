/*
 * Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler as
 *  dimensões de um terreno e depois exibir a área do terreno.

Exemplos de entrada	Exemplos de saída
3 6	18
2 18	36
 * 
 */

import java.util.Scanner;
public class Uni3Exe01 {

    public static int area(int alt, int lar) {
        return alt * lar;
    }


    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int alt = teclado.nextInt();
        int lar = teclado.nextInt();
        
        System.out.println(area(alt, lar));
        teclado.close();
    }
}
