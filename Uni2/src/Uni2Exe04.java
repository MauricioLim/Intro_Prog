//Uni2Exe04 [1][1005]
//Leia dois valores de ponto flutuante e calcule a média ponderada sabendo que a nota A
//tem peso 3.5 e nota B 7.5 (a soma dos pesos é 11), sendo que a nota vai de 0.0 a 10.0.

import java.util.Scanner;

public class Uni2Exe04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float priNota = teclado.nextFloat();
        priNota *= 0.35f;

        System.out.print("Digite a segunda nota: ");
        float segNota = teclado.nextFloat();
        segNota *= 0.75f;

        System.out.println("A media é: " + (priNota + segNota));

        teclado.close();        


        //TESTE DE MESA
        //Se os valores das notas forem 10, o resultado deve ser 11
    }
}
