/*Uni2Exe08 [1][1010]
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o 
valor unitário de cada peça 
2. Após, calcule e mostre o valor a ser pago.*/

import java.util.Scanner;

public class Uni2Exe08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o código da primeira peça: ");
        int codPriItem = teclado.nextInt();

        System.out.print("Informe a quantidade de itens: ");
        int qtdPriItem = teclado.nextInt();


        System.out.print("Informe o valor unitario no priemiro item: R$");
        float precoPriItem = teclado.nextFloat();

        System.out.print("Informe o código da segundo peça: ");
        int codSegItem = teclado.nextInt();

        System.out.print("Informe a quantidade de peças: ");
        int qtdSegItem = teclado.nextInt();


        System.out.print("Informe o valor unitario no segundo peça: R$");
        float precoSegItem = teclado.nextFloat();

        System.out.printf("O valor a ser pago é de R$%.2f%n", ((qtdPriItem * precoPriItem) + (qtdSegItem * precoSegItem)));
        teclado.close();
        

        //TESTE DE MESA
        //Se forem 2 uni do item 1 e ele valer 5 reais e 
        //também forem duas uni do item 2 e ele valem 5 reais cada o total será de R$20
    }
    

}
