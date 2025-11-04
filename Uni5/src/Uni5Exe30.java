import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o valor inicial N: ");
        int N = teclado.nextInt();
        
        System.out.print("Digite o decremento K: ");
        int K = teclado.nextInt();
        
        System.out.print("Digite o tamanho da mochila M: ");
        int M = teclado.nextInt();
        
        System.out.println("\nElementos a serem colocados na mochila:");
        int elemento = N;
        int somaDentro = 0;
        int somaFora = 0;
        
        String elementosDentro = "";
        String elementosFora = "";
        
        while (elemento > 0 && M > 0) {
            System.out.print(elemento + " ");
            
            if (elemento <= M) {
                elementosDentro += elemento + " ";
                somaDentro += elemento;
                M -= elemento;
            } else {
                elementosFora += elemento + " ";
                somaFora += elemento;
            }
            
            elemento -= K;
        }
        
        // Continua listando elementos que não cabem
        while (elemento > 0) {
            System.out.print(elemento + " ");
            elementosFora += elemento + " ";
            somaFora += elemento;
            elemento -= K;
        }
        
        System.out.println("\n\nElementos que entraram na mochila: " + elementosDentro);
        System.out.println("Elementos que ficaram fora da mochila: " + elementosFora);
        System.out.println("Soma dos elementos dentro: " + somaDentro);
        System.out.println("Soma dos elementos fora: " + somaFora);
        
        teclado.close();
    }
}