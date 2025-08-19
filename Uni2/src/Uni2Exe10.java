/*Uni2Exe10 [1][1019]
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica
, e informe-o expresso no formato horas:minutos:segundos.*/

import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o tempo em segundos: ");
        int seg = teclado.nextInt();
        
        int min = seg / 60;
        seg -= (min * 60);

        int hrs = min/60;
        min -= hrs * 60;

        System.out.print(hrs +":"+ min +":"+ seg);
        teclado.close();
    }    
}
