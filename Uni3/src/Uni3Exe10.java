/*
 * Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
Fórmula:
hipotenusa2 = cateto12 + cateto22
 */
public class Uni3Exe10 {
    public static double hipotenusa(double cat1, double cat2) {
        return Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
    }
    
    public static void main(String[] args) throws Exception {
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        System.out.print("Cateto Oposto: ");
        double cat1 = teclado.nextDouble();

        System.out.print("Cateto Adjacente: ");
        double cat2 = teclado.nextDouble();

        System.out.printf("A hipotenusa é: %.2f\n", hipotenusa(cat1, cat2));

        teclado.close();
    }
}
