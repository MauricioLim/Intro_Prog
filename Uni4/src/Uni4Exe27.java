import java.util.Scanner;

public class Uni4Exe27 {
    Scanner teclado = new Scanner(System.in);
    int horaCheg, minCheg, horaSai, minSai;

    public Uni4Exe27(){
        entrada();
        verifica();
    }

    public void entrada(){
        System.out.print("hora chegada: ");
        this.horaCheg = teclado.nextInt();

        System.out.print("minutos chegada: ");
        this.minCheg = teclado.nextInt();

        System.out.print("hora saida: ");
        this.horaSai = teclado.nextInt();

        System.out.print("Minutos chegada: ");
        this.minSai = teclado.nextInt();
    }

    public void verifica() {
        if (!(horaCheg < 0 || horaCheg > 23 || horaSai < 0 || horaSai > 23 ||  minCheg < 0 ||    minCheg > 59 || minSai < 0 || minSai > 59)) {
            valor();
        } else{
            System.out.println("Horario não permitido");
        }
    }

    public void valor(){
        int chegadaMin = this.horaCheg * 60 + this.minCheg;
        int saidaMin = this.horaSai * 60 + this.minCheg;
        int tempoTotal = saidaMin - chegadaMin;

        int horas = tempoTotal / 60;
        int minutosRestantes = tempoTotal % 60;

        if (minutosRestantes < 30) {
            if (horas > 0 && horas <= 2) {
                System.out.printf("Preço cobrado = R$%.2f", (horas * 5));
            } else if (horas > 2 && horas <= 4){
                System.out.printf("Preço cobrado = R$%.2f", (horas * 7.5));
            } else if (horas > 4){
                System.out.printf("Preço cobrado = R$%.2f", (horas * 10));
            }
        } else if (minutosRestantes >= 30){
            if (horas > 0 && horas <= 2) {
                System.out.printf("Preço cobrado = R$%.2f", ((horas  + 1)* 5));
            } else if (horas > 2 && horas <= 4){
                System.out.printf("Preço cobrado = R$%.2f", ((horas  + 1) * 7.5));
            } else if (horas > 4){
                System.out.printf("Preço cobrado = R$%.2f", ((horas  + 1) * 10));
            }
        } else if (horas > 0 && minutosRestantes > 0){
            System.out.printf("Preço cobrado = R$5");
        }
        
    }

    public static void main(String[] args) {
        new Uni4Exe27();
        
    }
}
