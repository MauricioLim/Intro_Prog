/*
Faça um programa para ler três notas de um aluno em uma disciplina e imprimira sua média ponderada (as notas tem pesos 
respectivos de 5, 3 e 2).
*/
import java.util.Scanner;
public class Uni3Exe04 {
    
    public static double media(double n1, double n2, double n3) {
        return (n1 * 0.5 + n2 * 0.3 + n3 * 0.2);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double n1 = teclado.nextDouble();
        double n2 = teclado.nextDouble();
        double n3 = teclado.nextDouble();

        System.out.printf("%.2f", media(n1, n2, n3));

        teclado.close();
    }
}