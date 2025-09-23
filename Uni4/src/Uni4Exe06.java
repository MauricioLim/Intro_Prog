import java.util.Scanner;

public class Uni4Exe06 {
    static Scanner teclado = new Scanner(System.in);
    char op;

    public Uni4Exe06(){
        opcao();
        verifica();
    }

    private  void opcao(){
        System.out.print("Digite o caracter: ");
        op = teclado.next().toUpperCase().charAt(0);
    }

    private void verifica(){
        if (op == 'M') {
            System.out.println("Masculino");
        } else if (op == 'F'){
            System.out.println("Feminino");
        } else if (op == 'I'){
            System.out.println("Não informado");
        } else {
            System.out.println("Entrada incorreta");
        }
    }

    public static void main(String[] args) {
        new Uni4Exe06();
    }
}
