/*
 * Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, 
 garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato,
  faça um programa para calcular quantos litros de refrigerante ele comprou.
*/

import java.util.Scanner;
public class Uni3Exe07 {

    public static double total(int qtdLt, int qtdGarM, int qtdGarG) {
        return (qtdLt * 350 + qtdGarM * 600 + qtdGarG * 2000) / 1000.0;
    }


    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidade de 350ml: ");
        int qtdLt = teclado.nextInt();

        System.out.print("Quantidade de 600ml: ");
        int qtdGarM = teclado.nextInt();

        System.out.print("Quantidade de 2L: ");
        int qtdGarG = teclado.nextInt();

        System.out.printf("O cliente comprou ao total %.2f\n", total(qtdLt, qtdGarM, qtdGarG));
        teclado.close();
    }
}
