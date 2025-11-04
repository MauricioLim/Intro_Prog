import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Valor máximo de pedágio: R$ ");
        double valorMaximo = teclado.nextDouble();
        
        int trechosAcimaMaximo = 0;
        int totalTrechos = 0;
        int trechosLongosAceitos = 0;
        
        while (true) {
            System.out.print("Digite o valor do pedágio (negativo para sair): R$ ");
            double pedagio = teclado.nextDouble();
            
            if (pedagio < 0) {
                break;
            }
            
            System.out.print("Digite a distância (em Km): ");
            double distancia = teclado.nextDouble();
            
            totalTrechos++;
            
            if (pedagio > valorMaximo) {
                trechosAcimaMaximo++;
            }
            
            if (distancia > 150 && pedagio <= valorMaximo) {
                trechosLongosAceitos++;
            }
        }
        
        System.out.println("\n--- Resultados ---");
        System.out.println(trechosAcimaMaximo + " (trechos com valor acima do qual ele nega-se a pagar)");
        System.out.println(totalTrechos + " (quantidade de trechos informados)");
        System.out.println(trechosLongosAceitos + " (trechos acima de 150km com valor aceito por ele)");
        
        teclado.close();
    }
}