import java.util.Scanner;

public class Uni4Exe01 {
    public static double salarioTotal(int horas, double valor){
        double salario;
        double extra;
        if (horas > 160){
            salario = valor * horas;
            extra = (horas - 160) * (valor + (valor * 0.5));
            return salario + extra;
        } else {
            return horas * valor;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Horas trabalhadas no mês: ");
        int horas = teclado.nextInt();

        System.out.print("Valor pago por hora: ");
        double valor = teclado.nextDouble();


        System.out.printf("O salario total é: %.2f", salarioTotal(horas, valor) );

        teclado.close();
    }
}
