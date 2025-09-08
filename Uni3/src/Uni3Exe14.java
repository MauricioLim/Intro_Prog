/*
 * Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, 
 * calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.
 */

import java.util.Scanner;

public class Uni3Exe14 {
    
    public static int velocidade(int distância, int tempo) {
        return distância / tempo;
    }

    public static double combustível(int distância) {
        return distância / 12.0;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Distancia: ");
        int distância = teclado.nextInt();

        System.out.print("Tempo: ");
        int tempo = teclado.nextInt();

        System.out.println("A velocidade média foi de " + velocidade(distância, tempo) + "km/h  e a quantidade de combustível usado foi " + combustível(distância) + " litros.");

        teclado.close();
    }
}
