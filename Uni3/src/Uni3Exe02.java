/* Uma loja de calçados está concedendo 12% de desconto nos produtos. Escreva um programa para calcular e exibir o valor de
 desconto a ser dado num par de sapatos e quanto deve custar o produto com o desconto. 
 O preço do par de sapatos deve ser informado pelo usuário. Como resultado, o programa deverá exibir as seguintes 
 mensagens:
 O valor do desconto é de R$ xxx
O preço do par de sapatos com desconto é R$ xxx
 * 
*/
import java.util.Scanner;
public class Uni3Exe02 {
    public static double desconto(double preco) {
        return preco * 0.12;
    }


    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double preco = teclado.nextDouble();
        
        System.out.printf("O valor do desconto é de R$ %.2f%n", desconto(preco));
        System.out.printf("O preço do par de sapatos com desconto é R$ %.2f%n", (preco - desconto(preco)));

        
        teclado.close();
    }
}