import java.util.Scanner;

public class Uni4Exe14 {
    Scanner teclado = new Scanner(System.in);
    private int dia, mes, ano;

    public Uni4Exe14(){
        entrada();
        verifica();
    }

    public void entrada(){
        System.out.print("Digite o dia: ");
        this.dia = teclado.nextInt();

        System.out.print("Digite o mes: ");
        this.mes = teclado.nextInt();

        System.out.print("Digite o ano: ");
        this.ano = teclado.nextInt();
    }

    public void verifica(){
        if (this.dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                System.out.print("Valida");
            } else if (mes != 2 && dia < 31){
                System.out.print("Valida");
            } else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)){
                System.out.print("Valida");
            } else{
                System.out.print("Não valida");
            }
        } else {
            System.out.print("Não valida");
        }
    }

    public static void main(String[] args) {
        new Uni4Exe14();
    }
}
