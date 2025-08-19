import java.util.Scanner;

public class Uni2Exe03 {


    //Uni2Exe03 [1][1002]
    //Calcule a área da circunferência elevando o valor de raio ao quadrado e multiplicando por π (π = 3.14159).

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);    


        System.err.print("Informe o raio: ");
        float raio = teclado.nextFloat();


        //3.14159 = valor de Pi fixo
        System.err.println("A circunferencia é: " + ((raio * raio) * 3.14159));
        teclado.close();

        //TESTE DE MESA
        //Se o raio for 2 o valor final deve ser: 12,56636
    }}
