/*
 * Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. Considerando
 * que o atendente tem a cotação do dólar, descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.
 * 
 * 
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe08 {

    public static double total(double recebido, double dolar) {
        return recebido * dolar;
    }
    

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        System.out.print("Valor em dólares recebido pelo cliente: ");
        double recebido = teclado.nextDouble();

        System.out.print("Cotação do dólar hoje: ");
        double dolar = teclado.nextDouble();

        System.out.println("O atendente deve devolver R$" + df.format(total(recebido, dolar)) +  " para o cliente.");
        
        teclado.close();
    }
    
}
