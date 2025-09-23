import java.util.Scanner;

public class Uni4Exe19 {
    Scanner teclado = new Scanner(System.in);
    private int x, y;

    public Uni4Exe19(){
        entrada();
        verifica();
    }

    public void entrada(){
        System.out.print("X: ");
        this.x = teclado.nextInt();

        System.out.print("Y: ");
        this.y = teclado.nextInt();
    }

    public void verifica(){
        if (x == 0 && y == 0){
            System.out.print("Quadrante 0");
        } else if(x > 0 && y > 0){
            System.out.print("Quadrante 1");
        } else if(x > 0 && y < 0){
            System.out.print("Quadrante 2");
        } else if (x < 0 && y < 0){
            System.out.print("Quadrante 3");
        } else if (x < 0 && y > 0){
            System.out.print("Quadrante 4");
        } else {
            System.out.print("Entrada invalida");
        }
    }

    public static void main(String[] args) {
        new Uni4Exe19();
    }

}
