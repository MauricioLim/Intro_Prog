import java.util.Scanner;

public class Uni6Exe01 {
    Scanner teclado = new Scanner(System.in);
    public Uni6Exe01(){
        int numeros[] = new int[10];

        escrever(numeros);
        System.out.println("==============");
        ler(numeros);
    }

    //Metodo pra add valores no vetor
    private void escrever(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": " );
            vetor[i] = teclado.nextInt();
        }
    }

    //Metodo pra ler os valores em um vetor, mas lendo de trás pra frente
    private void ler(int[] vetor){
        for (int i = vetor.length -1; i >= 0; i--) {
            System.out.println("Valor na posição " + (i + 1) + ": " + vetor[i]);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe01();
    }
}
