import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int pontosDireita = 0;
        int pontosEsquerda = 0;
        boolean partidaEncerrada = false;
        
        while (!partidaEncerrada) {
            System.out.print("Digite o código do ponto (D para direita, E para esquerda): ");
            char ponto = teclado.next().charAt(0);
            
            if (ponto == 'D' || ponto == 'd') {
                pontosDireita++;
            } else if (ponto == 'E' || ponto == 'e') {
                pontosEsquerda++;
            } else {
                System.out.println("Código inválido! Use D ou E.");
                continue;
            }
            
            System.out.println("Placar: Direita " + pontosDireita + " x " + pontosEsquerda + " Esquerda");
            
            // Verifica condições de término
            if ((pontosDireita >= 21 || pontosEsquerda >= 21) && 
                pontosDireita - pontosEsquerda >= 2) {
                partidaEncerrada = true;
            }
            
            if (pontosDireita > 21 && (pontosDireita - pontosEsquerda) >= 2) {
                partidaEncerrada = true;
            }
            
            if (pontosEsquerda > 21 && (pontosEsquerda - pontosDireita) >= 2) {
                partidaEncerrada = true;
            }
        }
        
        System.out.println("\n--- FIM DE PARTIDA ---");
        System.out.println("Placar final: Direita " + pontosDireita + " x " + pontosEsquerda + " Esquerda");
        
        if (pontosDireita > pontosEsquerda) {
            System.out.println("Vencedor: Jogador da Direita");
        } else {
            System.out.println("Vencedor: Jogador da Esquerda");
        }
        
        teclado.close();
    }
}