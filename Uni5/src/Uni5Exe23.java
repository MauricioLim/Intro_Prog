import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        char continuar = 's';
        
        while (continuar == 's' || continuar == 'S') {
            System.out.print("Digite o nome do vendedor: ");
            String nome = teclado.next();
            
            System.out.print("Digite o número de produtos vendidos: ");
            int n = teclado.nextInt();
            
            double totalVendas = 0;
            
            for (int i = 1; i <= n; i++) {
                System.out.print("Digite o preço unitário do produto " + i + ": R$ ");
                double preco = teclado.nextDouble();
                
                System.out.print("Digite a quantidade vendida do produto " + i + ": ");
                int quantidade = teclado.nextInt();
                
                totalVendas += preco * quantidade;
            }
            
            double salario = totalVendas * 0.30;
            
            System.out.println("\n--- Relatório do Vendedor ---");
            System.out.println("Nome: " + nome);
            System.out.printf("Total de vendas: R$ %.2f\n", totalVendas);
            System.out.printf("Salário: R$ %.2f\n", salario);
            
            System.out.print("\nDeseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)? ");
            continuar = teclado.next().charAt(0);
        }
        
        teclado.close();
    }
}