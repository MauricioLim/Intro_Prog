/*
 * Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:
    volume = pi *  raio2 * altura
*/

import java.util.Scanner;

public class Uni3Exe09 {
    
    public static double volume(int raio, int altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Raio: ");
        int raio = teclado.nextInt();

        System.out.print("ALtura: ");
        int altura = teclado.nextInt();

        System.out.printf("O volume da lata de óleo é: %.2f\n", volume(raio, altura));
        
        teclado.close();
    }

}
