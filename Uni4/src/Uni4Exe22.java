import java.util.Scanner;

public class Uni4Exe22 {
    Scanner teclado = new Scanner(System.in);
    private int escolha;

    public Uni4Exe22(){
        entrada();
        mostra();
    }

    public void entrada(){
        System.out.println("Escolha a graduação");
        System.out.println("====================");
        System.out.println("1 - Ciência da Computação \n2 - Licenciatura da Computação \n3 - Sistemas de Informação");
        
        this.escolha = teclado.nextInt();
    }

    public void mostra(){
        switch (this.escolha) {
            case 1:
                System.out.print("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.print("Licenciado em Computação");
                break;
            case 3:
                System.out.print("Bacharel em Sistemas de Informação");
                break;
            default:
                System.out.print("Opção invalida");
                break;
        }
    }

    public static void main(String[] args) {
        new Uni4Exe22();
    }

}
