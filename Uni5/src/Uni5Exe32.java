import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o dia da semana do primeiro dia (1=Domingo,...,7=Sábado): ");
        int primeiroDia = teclado.nextInt();
        
        System.out.print("Digite o número de dias no mês: ");
        int diasNoMes = teclado.nextInt();
        
        // Cabeçalho
        System.out.println("\nD\tS\tT\tQ\tQ\tS\tS");
        
        // Espaços antes do primeiro dia
        for (int i = 1; i < primeiroDia; i++) {
            System.out.print("\t");
        }
        
        // Dias do mês
        int diaAtual = 1;
        int diaSemana = primeiroDia;
        
        while (diaAtual <= diasNoMes) {
            System.out.print(diaAtual + "\t");
            
            if (diaSemana == 7) {
                System.out.println();
                diaSemana = 1;
            } else {
                diaSemana++;
            }
            
            diaAtual++;
        }
        
        teclado.close();
    }
}