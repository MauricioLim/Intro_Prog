import java.util.Scanner;

public class Uni6Exe03 {
    double[] numeros = new double[12];
    Scanner teclado = new Scanner(System.in);
    
    public Uni6Exe03(){
        escrever(this.numeros);
        aumento(this.numeros);
        mostrar(this.numeros);
    }

    private void escrever(double[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o valor da posição " + (i + 1) + ": ");
            vetor[i] = teclado.nextDouble();
        }
    }

    private void aumento(double[] vetor){
        for (int i = 0; i < vetor.length; i++){
            if (i % 2 == 0){
                vetor[i] += vetor[i] * 0.02 ; 
            } else if (i % 2 != 0){
                vetor[i] += vetor[i] * 0.05; 
            }
        }
    }

    private void mostrar(double[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Novo valor da posição " + i + ": " + vetor[i]);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe03();
    }

}
