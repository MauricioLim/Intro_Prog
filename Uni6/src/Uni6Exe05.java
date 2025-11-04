import java.util.Scanner;

public class Uni6Exe05 {
    Scanner teclado = new Scanner(System.in);
    String[] perguntas = {"Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?", "Gosta de redes sociais?", "Gosta da Oktoberfest?"};
    String[] cara = new String[5];
    String[] moca = new String[5];
    int afinidade;

    public Uni6Exe05(){
        Entrada(this.cara, this.perguntas);
        PulaLinha();
        Entrada(this.moca, this.perguntas);
        PulaLinha();
        this.afinidade = CalculaAfin(this.cara, this.moca);

        Exibe(this.afinidade);
    }

    private void Entrada(String[] vetor, String[] pergunta){
        System.out.println("Responda com: SIM, NAO ou IND");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(pergunta[i]);
            vetor[i] = teclado.nextLine().toUpperCase();
        }
    }

    private void PulaLinha(){
        System.out.println("===================");
    }

    private int CalculaAfin(String[] vetorCara, String[] vetorMoca){
        int pontos = 0;
        for (int i = 0; i < vetorMoca.length; i++) {
            if (vetorCara[i].equals(vetorMoca[i])) {
                pontos += 3;
            } else if((vetorCara[i].equals("IND") && (vetorMoca[i].equals("SIM") || vetorMoca[i].equals("NAO"))) || (vetorMoca[i].equals("IND") && (vetorCara[i].equals("SIM") || vetorCara[i].equals("NAO")))){
                pontos +=1;
            } else if ((vetorCara[i].equals("SIM") && vetorMoca[i].equals("NAO")) || (vetorCara[i].equals("NAO") && vetorMoca[i].equals("SIM"))){
                pontos -= 2;
            }
        }
        return pontos;
    }
    
    private void Exibe(int pontos){
        if (pontos >= 15) {
            System.out.println("Casem!");
        } else if (pontos > 0 && pontos < 15) {
            System.out.println("Vocês tem muita coisa em comum!");
        } else if(pontos > 4 && pontos < 10) {
            System.out.println("Talvez não de certo :(");
        } else if (pontos > -1 && pontos < 5){
            System.out.println("Vale um encontro");
        } else if (pontos > -10 && pontos < 0){
            System.out.println("Melhor não perder tempo");
        } else if(pontos < -9){
            System.out.println("Vocês se odeiam");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe05();
    }
}
