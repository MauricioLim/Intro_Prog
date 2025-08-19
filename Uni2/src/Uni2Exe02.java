//Uni2Exe02 [1][1004]
//Leia 2 valores inteiros e imprima sua multiplicação.

import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Integer n1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        Integer n2 = teclado.nextInt();

        System.err.println("A multiplicação entre " + n1 + " e " + n2 + " é igual á: " + (n1*n2));
        teclado.close();



        //TESTE DE MESA
        //Se os valores forem 2 e 2 o resultado deve ser 4 
    }
}
