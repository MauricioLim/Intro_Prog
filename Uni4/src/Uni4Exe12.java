import java.util.Scanner;

public class Uni4Exe12 {
    Scanner teclado = new Scanner(System.in);
    int lado1, lado2, lado3;

    public Uni4Exe12(){
        entrada();
        verificacao();
    }

    private void entrada(){
        System.out.print("Informe o lado 1: ");
        lado1 = teclado.nextInt();

        System.out.print("Informe o lado 2: ");
        lado2 = teclado.nextInt();

        System.out.print("Informe o lado 3: ");
        lado3 = teclado.nextInt();
    }

    private void verificacao(){
        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)){
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.print("É equilatero");
            } else if(lado1 == lado2 || lado1 == 3 || lado2 == lado3){
                System.out.print("É isósceles");
            } else{
                System.out.print("É escaleno");
            }
        } else{
            System.out.println("Não formam um triângulo");
        }
    }
    
    public static void main(String[] args) {
        new Uni4Exe12();
    }
}
