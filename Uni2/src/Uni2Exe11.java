/*Uni2Exe11 [2][1012]
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159).
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */

import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("informe o valor de A: ");
        double valorA = teclado.nextDouble();

        System.out.print("Informe o valor de B: ");
        double valorB = teclado.nextDouble();

        System.out.print("Informe o valor de C: ");
        double valorC = teclado.nextDouble();

        //TESTE DE MESA: area do trinagulo se A = 5 e B = 2, então area = 5
        System.out.println("A area do triangulo é: " + ((valorA * valorB) / 2));
        
        //TESTE DE MESA: se c for 2  total será 12.56636
        System.out.println("A area do circulo C é: " + (3.14159 * (Math.pow(valorC, 2))) );

        //TESTE DE MESA: a area será 10 se A e B forem 5 e C for 2
        System.out.println("A area do trapezio é: " + (((valorA + valorB) * valorC) / 2));

        //TESTE DE MESA: area do quadrado será 4 se B = 2
        System.out.print("Area do quarado: " + (Math.pow(valorB, 2)));

        //TESTE DE MESA: area será 10 se A = 5 e B = 2
        System.out.print("Area do retangulo: " + (valorA * valorB));

        teclado.close();
    }
}
