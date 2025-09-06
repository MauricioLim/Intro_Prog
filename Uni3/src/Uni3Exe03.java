/*
Um motorista deseja abastecer seu tanque de combustível. Escreva um programa para ler o preço do litro
 da gasolina e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.
*/
import java.util.Scanner;
public class Uni3Exe03 {

    public static double qtd(double gaso, double valor) {
        return valor / gaso;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o preço do litro da gasolina: ");
        double gaso = teclado.nextDouble();

        System.out.print("Digite o valor do pagamento: ");
        double valor = teclado.nextDouble();

        

        System.out.printf("O motorista conseguiu abastecer %.2f litros no tanque.%n", qtd(gaso, valor));

        teclado.close();
    }
}