//Uni2Exe05 [1][1007]
//Leia quatro valores inteiros A, B, C e D. A seguir, 
//calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a 
//fórmula: DIFERENCA = (A * B - C * D).

import java.util.Scanner;


public class Uni2Exe05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.print("Digite o valor A: ");
        int valorA = teclado.nextInt();
        System.out.print("Digite o valor B: ");
        int valorB = teclado.nextInt();
        System.out.print("Digite o valor C: ");
        int valorC = teclado.nextInt();
        System.out.print("Digite o valor D: ");
        int valorD = teclado.nextInt();

        System.out.println("A diferença é: " + ((valorA * valorB) - (valorC * valorD)));
        teclado.close();        
    }
}

//TESTE DE MESA
//Se A = 2, B = 2, C = 2 e D = 1, o resultado será 2