import java.util.Scanner;

public class Uni4Exe26 {
    Scanner teclado = new Scanner(System.in);
    private double base, altura, raio;
    private char opcao;

    public Uni4Exe26(){
        entrada();
        opcoes();
    }

    public void entrada(){
        System.out.println("Escolha uma opção: \nT: calcular a área de um triângulo de base b e altura h \nQ: calcular a área de um quadrado de lado l \nR: calcular a área de um retângulo de base b e altura h \nC: calcular a área de um círculo de raio r");
        System.out.println("----------------------------------------");
        this.opcao = teclado.next().toUpperCase().charAt(0);

        System.out.println();
    }

    public void opcoes(){
        switch (this.opcao) {
            case 'T':
                triangulo();
                break;
            case 'Q':
                quadrado();
                break;
            case 'R':
                retangulo();
                break;
            case 'C':
                circulo();
                break;    
            default:
                System.out.print("Opção invalida");
                break;
        }
    }

    public void triangulo(){
        System.out.print("Informe a base: ");
        this.base = teclado.nextInt();

        System.out.print("Informe a altura: ");
        this.altura = teclado.nextInt();

        System.out.printf("Aréa do triangulo: %.2f", ((base * altura) / 2));
    }

    public void quadrado(){
        System.out.print("Informe a o lado: ");
        this.altura = teclado.nextInt();

        System.out.printf("Área do quadrado: %.2f", (Math.pow(altura, 2)));
    }

    public void retangulo(){
        System.out.print("Informe a base: ");
        this.base = teclado.nextInt();

        System.out.print("Informe a altura: ");
        this.altura = teclado.nextInt();

        System.out.printf("Aréa do retangulo: %.2f", (base * altura));
    }

    public void circulo(){
        System.out.print("Informe o raio: ");
        this.raio = teclado.nextInt();


        System.out.printf("Aréa do circulo: %.2f", (Math.PI * Math.pow(this.raio, 2)));
    }

    public static void main(String[] args) {
        new Uni4Exe26();
    }
}
