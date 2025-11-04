import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int votos1 = 0, votos2 = 0, votos3 = 0, votos4 = 0;
        int totalVotos = 0;
        char continuar = 's';
        
        System.out.println("Conjuntos participantes:");
        System.out.println("1 - Nenhum de Nós");
        System.out.println("2 - CPM22");
        System.out.println("3 - Skank");
        System.out.println("4 - Jota Quest");
        
        while (continuar == 's' || continuar == 'S') {
            System.out.print("Digite o código do conjunto (1-4): ");
            int voto = teclado.nextInt();
            
            switch (voto) {
                case 1:
                    votos1++;
                    break;
                case 2:
                    votos2++;
                    break;
                case 3:
                    votos3++;
                    break;
                case 4:
                    votos4++;
                    break;
                default:
                    System.out.println("Código inválido!");
                    continue;
            }
            
            totalVotos++;
            
            System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
            continuar = teclado.next().charAt(0);
        }
        
        // Resultados
        System.out.println("\n--- Resultados da Eleição ---");
        System.out.println("Nenhum de Nós: " + votos1 + " votos (" + 
                          (votos1 * 100.0 / totalVotos) + "%)");
        System.out.println("CPM22: " + votos2 + " votos (" + 
                          (votos2 * 100.0 / totalVotos) + "%)");
        System.out.println("Skank: " + votos3 + " votos (" + 
                          (votos3 * 100.0 / totalVotos) + "%)");
        System.out.println("Jota Quest: " + votos4 + " votos (" + 
                          (votos4 * 100.0 / totalVotos) + "%)");
        
        // Determina vencedor
        int maxVotos = Math.max(Math.max(votos1, votos2), Math.max(votos3, votos4));
        String vencedor = "";
        
        if (votos1 == maxVotos) vencedor = "Nenhum de Nós";
        if (votos2 == maxVotos) vencedor = "CPM22";
        if (votos3 == maxVotos) vencedor = "Skank";
        if (votos4 == maxVotos) vencedor = "Jota Quest";
        
        System.out.println("Grupo vencedor: " + vencedor);
        
        teclado.close();
    }
}