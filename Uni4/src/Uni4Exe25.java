import java.util.Scanner;

public class Uni4Exe25 {

    static Scanner teclado = new Scanner(System.in);
    static  int n1, n2, op;

    public Uni4Exe25(){
        executa();
    }

    

    public static void executa(){
        mensagem();
        opcao();
        n1 = numeros();
        n2 = numeros();
        operacao();
    }

    public static void mensagem(){
        System.out.println("Escolha uma opção e após isso informe dois números");
        System.out.println("---------------------------------------------------");
        System.out.println(" 1 - Somar\n 2 - Subtrair\n 3 - Multiplicar\n 4 - Dividir");
        System.out.println("---------------------------------------------------");
        System.out.println();
    }

    public static void opcao(){
        System.out.print("Informe a opção: ");
        op = teclado.nextInt();      
    }

    public static void operacao(){
        switch (op) {
            case 1:
                System.out.println("A soma entre os dois números é: " + soma()); 
                break;
            case 2:
                System.out.println("A subtração entre os dois números é: " + subtracao());
                break;
            case 3:
                System.out.println("A multiplicação entre os dois números é: " + multiplicacao()); 
                break;
            case 4:
                System.out.println("A divisão entre os dois números é: " + divisao());
                break;
            default:
                System.out.println("Opção invalida");
                System.out.println();
                opcao();
                operacao();
                break; 

        }
    }

    public static double soma(){
        return n1 + n2;
    }

    public static double subtracao(){
        return n1 - n2;
    }

    public static double multiplicacao(){
        return n1 * n2;
    }

    public static double divisao(){
        if (n2 > 0) {
            return n1 / n2;    
        } else {
            return 0;
        }
        
    }

    public static int numeros(){

        System.out.print("Digite um número: ");
        int num = teclado.nextInt();
        
        return num;
    }

    public static void main(String[] args) {

        new Uni4Exe25();

    }
}
