import java.util.Scanner;

public class Uni4Exe15 {
    Scanner teclado = new Scanner(System.in);
    private int meses;

    public Uni4Exe15(){
        entrada();
        verifica();
    }

    public void entrada (){
        System.out.print("Informe os meses: ");
        this.meses = teclado.nextInt();
    }

    public void verifica(){
        if(this.meses > 0 && this.meses < 13){
            System.out.print("O funcionário irá receber 5% de reajuste");
        } else if (this.meses > 12 && this.meses < 49){
            System.out.print("O funcionário irá receber 7% de reajuste");
        } else {
            System.out.print("Reajuste não informado");
        }
    }

    public static void main(String[] args) {
        new Uni4Exe15();
    }
}
