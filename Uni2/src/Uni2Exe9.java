/*Uni2Exe09 [1]
Uma pessoa foi até uma casa de câmbio trocar dólares por reais. 
Para isto ela entregou um valor em dólares para o atendente. 
Considerando que o atendente tem a cotação do dólar, 
calcule quantos reais o atendente deve devolver para a pessoa.*/

import java.util.Scanner;

public class Uni2Exe9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o valor em dolares que deseja trocar: $");
        float dolar = teclado.nextFloat();

        //USANDO O VALOR FIXO DA COTAÇÃO ATUAL (5,44)
        System.out.printf("O valor $" + dolar + " em reais é igual a R$%.2f%n", (dolar * 5.44f));

        teclado.close();
    }
}

//TESTE DE MESA
/*se o usuário tiver somente 1 dolar o valor em reais será de R$5,44 */
