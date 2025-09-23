import java.util.Scanner;

public class Uni4Exe17 {
    Scanner teclado = new Scanner(System.in);
    private int renda, qtd;
    
    public Uni4Exe17() {
        entrada();
        calculo();
    }

    public void entrada(){
       System.out.print("Renda anual: "); 
       this.renda = teclado.nextInt();

       System.out.print("Qtde de dependentes: ");
       this.qtd = teclado.nextInt();
    }

    public void calculo(){
        double rendaLiq = this.renda - (this.renda * (this.qtd * 0.02));

        if (rendaLiq > 0 && rendaLiq <= 1999) {
            System.out.print("Sem imposto");
        } else if (rendaLiq >= 2000 && rendaLiq <= 4999){
            System.out.printf("O imposto é de 5 R$%.2f", (rendaLiq * 0.05));
        } else if (rendaLiq >= 5000 && rendaLiq <= 9999){
            System.out.printf("O imposto é de 10  R$%.2f", (rendaLiq * 0.1));
        } else {
            System.out.printf("O imposto é de 15 R$%.2f", (rendaLiq * 0.15));
        }
    }

    public static void main(String[] args) {
        new Uni4Exe17();
    }

}
