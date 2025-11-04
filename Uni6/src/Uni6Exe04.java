import java.util.Scanner;

public class Uni6Exe04 {
    Scanner teclado = new Scanner(System.in);
    int[] primeiroVet = new int[10];
    int[] segundoVet = new int[10];
    int[] terceiroVet = new int[10];

    public Uni6Exe04(){
        Escreve(this.primeiroVet);
        System.out.println("=============");
        Escreve(this.segundoVet);
        System.out.println("=============");
        Soma(this.primeiroVet, this.segundoVet, this.terceiroVet);
        Exibe(this.primeiroVet, this.segundoVet, this.terceiroVet);
    }

    private void Escreve(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o valor da posição " + (i + 1) + ": ");
            vetor[i] = teclado.nextInt();
        }
    }

    private void Soma(int[] primeiro, int[] segunto, int[] somaVet){
        for (int i = 0; i < somaVet.length; i++) {
            somaVet[i] = primeiro[i] + segunto[i];
        }
    }

    private void Exibe(int[] primeiro, int[] segunto, int[] somaVet){
        System.out.println("Primeiro Vetor");
        for (int i = 0; i < primeiro.length; i++) {
            System.out.println((i + 1) + ": " + primeiro[i]);
        }

        System.out.println("---------------");
        System.out.println("Segunto Vetor");
        for (int i = 0; i < segunto.length; i++) {
            System.out.println((i + 1) + ": " + segunto[i]);
        }

        System.out.println("---------------");
        System.out.println("Terceiro Vetor");
        for (int i = 0; i < somaVet.length; i++) {
            System.out.println((i + 1) + ": " + somaVet[i]);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe04();
    }
}
