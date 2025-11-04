import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o limite diário de pesca (em kg): ");
        double limiteKg = teclado.nextDouble();
        double limiteGramas = limiteKg * 1000;
        
        double pesoTotal = 0;
        char continuar = 's';
        
        while (continuar == 's' || continuar == 'S') {
            System.out.print("Digite o peso do peixe (em gramas): ");
            double pesoPeixe = teclado.nextDouble();
            
            pesoTotal += pesoPeixe;
            
            System.out.printf("Peso total da pesca até agora: %.2f gramas\n", pesoTotal);
            
            if (pesoTotal > limiteGramas) {
                System.out.println("Limite diário excedido! Encerrando a pesca.");
                break;
            }
            
            System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
            continuar = teclado.next().charAt(0);
        }
        
        teclado.close();
    }
}