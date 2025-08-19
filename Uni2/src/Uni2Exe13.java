/*
 * Uni2Exe13 [2][1016]
    Dois carros (X e Y) partem em uma mesma direção.
 O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h. 
 Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja,
 consegue se afastar um quilômetro a cada 2 minutos. Leia a distância (em Km) e 
calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.



carro Y se afasta 0,5 km por minuto

90-60 = 30

30/60 = 0,5 ou seja 1km a cada 2min



*/

import java.util.Scanner;

public class Uni2Exe13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a distancia em KM: ");
        int distancia = teclado.nextInt();

        System.out.print("Levara um total de " + (distancia * 0.5));

        teclado.close();        
    }
}
