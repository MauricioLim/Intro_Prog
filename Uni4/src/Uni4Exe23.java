import java.util.Scanner;

public class Uni4Exe23 {
    Scanner teclado = new Scanner(System.in);
    private int mes;

    public Uni4Exe23(){
        entrada();
        mostra();
    }

    public void entrada(){
        System.out.print("Informe o número inteiro: ");
        this.mes = teclado.nextInt();
    }

    public void mostra (){
        switch (this.mes) {
            case 1:
                System.out.print("Janeiro");
                break;
            case 2:
                System.out.print("Fevereiro");
                break;
            case 3:
                System.out.print("Março");
                break;
            case 4:
                System.out.print("Abril");
                break;
            case 5:
                System.out.print("Maio");
                break;
            case 6:
                System.out.print("Junho");
                break;
            case 7:
                System.out.print("Julho");
                break;
            case 8:
                System.out.print("Agosto");
                break;
            case 9:
                System.out.print("Setembro");
                break;
            case 10:
                System.out.print("Outubro");
                break;
            case 11:
                System.out.print("Novembro");
                break;
            case 12:
                System.out.print("Dezembro");
                break;                                            
            default:
                System.out.print("Valor invalido");
                break;
        }
    }

    public static void main(String[] args) {
        new Uni4Exe23();
    }
}
