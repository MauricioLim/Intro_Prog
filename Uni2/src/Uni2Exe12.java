/*
 * 
 * Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano,
 * p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula,
 *  segundo a fórmula:

 */

import java.util.Scanner;

public class Uni2Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor de X: ");
        float priX = teclado.nextFloat();

        System.out.print("Digite o segundo valor de X: ");
        float segX = teclado.nextFloat();

        System.out.print("Digite o primeiro valor de Y: ");
        float priY = teclado.nextFloat();

        System.out.print("Digite o segundo valor de Y: ");
        float segY = teclado.nextFloat();

        System.out.printf("A distancia é: %.2f%n", (Math.sqrt((Math.pow((segX - priX), 2) + Math.pow((segY - priY), 2)))));

        teclado.close();
    }
}
