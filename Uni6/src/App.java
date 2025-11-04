import java.util.Scanner;

public class App {
    Scanner teclado = new Scanner(System.in);
    
    public App(){
        //Iniciando o vetor de strings com 5 posicoes vazias
        String nomes[] = new String[5];

        //Iniciando um vetor de números inteiros com valores fixos
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};

        inserirValores(vetor);
        visualizarValores(vetor);
    }

    private void inserirValores(int[] vetor){
        //Pra inserir valores em um vetor é preciso fazer um for pera poder adicionar em cada posicao
        //Lembrando que a primeira posição de um vetor é o indice 0
        //vetor.length é usado para o for percorrer somente o mesmo tamnho que o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número inteiro: ");
            vetor[i] = teclado.nextInt();
        }
    }

    private void visualizarValores(int [] vetor){
        //Mesma questão que para inserir valores 
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Valor na posição " + (i + 1) + ": " + vetor[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}
