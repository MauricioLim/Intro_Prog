import java.util.Scanner;

public class Uni6Exe02 {
    Scanner teclado = new Scanner(System.in);
    double[] numeros = new double[12];
    double valores = 0;

    public Uni6Exe02(){

        escrever(this.numeros);
        media(this.numeros);
        exibe(numeros, valores);
    }

    private void escrever(double[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o valor da posição " + (i + 1) + ":" );
            vetor[i] = teclado.nextInt();
        }
    }

    private void media(double[] vetor){
        System.out.println("=============");
        for (int i = 0; i < vetor.length; i++) {
            this.valores += vetor[i]; 
        }
        this.valores = this.valores / vetor.length;
    }

    private void exibe(double[] vetor, double media){
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println("O valor " + vetor[i] + " na posição " + (i + 1) + " do vetor é maior que a media");
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe02();
    }


}
