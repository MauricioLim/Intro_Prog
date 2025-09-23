import java.util.Scanner;

public class Uni4Exe07 {
    Scanner teclado = new Scanner(System.in);
    double peso;

    public Uni4Exe07(){
        pesagem();
        valor();
    }  

    private void pesagem(){
        System.out.print("Informe o peso em gr: ");
        peso = teclado.nextDouble();
    }

    private void valor(){
        double valorTotal;
        if (peso > 50) {
            valorTotal = 0.45 + ((((peso - 50) / 20) + 1) * 0.45f);
            System.out.printf("Custo do selo: %.4f", valorTotal);
        } else{
            valorTotal = 0.45;
            System.out.printf("Custo do selo: %.2f", valorTotal);
        }
    }


    public static void main(String[] args) {
        new Uni4Exe07();
    }
}
