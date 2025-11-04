import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int diaMaiorProducao = 0;
        int maiorProducaoTotal = 0;
        int totalManha = 0;
        int totalTarde = 0;
        int continuar = 1;
        
        while (continuar == 1) {
            int dia;
            do {
                System.out.print("Digite o dia do mês (1-30): ");
                dia = teclado.nextInt();
                if (dia < 1 || dia > 30) {
                    System.out.println("Dia inválido");
                }
            } while (dia < 1 || dia > 30);
            
            System.out.print("Digite a produção no turno da manhã: ");
            int manha = teclado.nextInt();
            
            System.out.print("Digite a produção no turno da tarde: ");
            int tarde = teclado.nextInt();
            
            double valorRecebido;
            int producaoTotal = manha + tarde;
            
            if (dia <= 15) {
                if (producaoTotal > 100 && manha >= 30 && tarde >= 30) {
                    valorRecebido = producaoTotal * 0.80;
                } else {
                    valorRecebido = producaoTotal * 0.50;
                }
            } else {
                valorRecebido = (manha * 0.40) + (tarde * 0.30);
            }
            
            System.out.printf("R$ %.2f (valor recebido)\n", valorRecebido);
            
            // Atualiza estatísticas
            if (producaoTotal > maiorProducaoTotal) {
                maiorProducaoTotal = producaoTotal;
                diaMaiorProducao = dia;
            }
            
            totalManha += manha;
            totalTarde += tarde;
            
            System.out.print("Novo funcionário (1.sim 2.não)? ");
            continuar = teclado.nextInt();
        }
        
        System.out.println("\n--- Estatísticas ---");
        System.out.println("Dia de maior produção: " + diaMaiorProducao);
        System.out.println("Total produzido na manhã: " + totalManha);
        System.out.println("Total produzido na tarde: " + totalTarde);
        
        if (totalManha > totalTarde) {
            System.out.println("Período mais produtivo: Manhã (" + totalManha + " peças)");
        } else {
            System.out.println("Período mais produtivo: Tarde (" + totalTarde + " peças)");
        }
        
        teclado.close();
    }
}