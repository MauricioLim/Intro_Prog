/*
 * Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:
 * 
 * 
 * °F = (9/5) °C + 32
 */

import java.util.Scanner;

public class Uni3Exe11 {
    public static double tempe(double celsius) {
        return (1.8 * celsius) + 32;
    }

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double celsius = teclado.nextDouble();

        System.out.printf("%.2f\n", tempe(celsius));

        teclado.close();
    }
}
