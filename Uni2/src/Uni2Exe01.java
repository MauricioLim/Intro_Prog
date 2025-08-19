//Uni2Exe01 [1][1001]
//Leia 2 valores inteiros e imprima sua soma.

import java.util.Scanner;


public class Uni2Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.err.print("Digite um número: ");
        Integer n1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        Integer n2 = teclado.nextInt();

        System.out.println("A soma de " + n1 + " + " + n2 + " é: " + (n1+n2));

     teclado.close();
    }
}

//Se utilizado os números 1 e 1 o resultado esperado é 2