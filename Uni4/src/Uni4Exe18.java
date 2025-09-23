import java.util.Scanner;

public class Uni4Exe18 {
    Scanner teclado = new Scanner(System.in);
    private int diaVen, diaPag;
    private double valor;

    public Uni4Exe18(){
        entrada();
        verifica();
    }

    public void entrada(){
        System.out.print("Dia do vencimento: ");
        this.diaVen = teclado.nextInt();

        System.out.print("Dia do pagamento: ");
        this.diaPag = teclado.nextInt();

        System.out.print("Valor da prestação: ");
        this.valor = teclado.nextDouble();
    }

    public void verifica(){
        if(diaVen > 0 && diaVen <= 10 && diaPag > 0 && diaPag <= 31){
            if (diaPag <= diaVen) {
                System.out.printf("O pagamento está em dia. \nO valor da prestação = R$%.2f", (valor - (valor * 0.1)));
            } else if (diaPag >= diaPag && diaPag <= diaVen + 5){
                System.out.printf("Pagamento em atraso em até 5 dias. \nO valor da prestação = R$%.2f", valor);
            } else{
                System.out.printf("O pagamento está atrasado, terá multa de 2 por cento ao dia. \nO valor da prestação = R$%.2f", (valor + (((diaPag - diaVen) * 0.02) * valor)));
            }
        } else {
            System.out.print("Datas incorretas");
        }
    }

    public static void main(String[] args) {
        new Uni4Exe18();
    }
}
