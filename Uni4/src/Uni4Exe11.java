import java.util.Scanner;

public class Uni4Exe11 {
    Scanner teclado = new Scanner(System.in);
    int primeiro, segundo, terceiro;

    public Uni4Exe11(){
        entrada();
        verificacao();
    }

    private void entrada(){
        System.out.print("Informe a idade do primeiro: ");
        primeiro = teclado.nextInt();

        System.out.print("Informe a idade do segundo: ");
        segundo = teclado.nextInt();
        
        System.out.print("Informe a idade do terceiro: ");
        terceiro = teclado.nextInt();
    }

    private void verificacao(){
        if (primeiro == segundo && primeiro == terceiro) {
            System.out.print("TRIGÊMEOS");
        } else if (primeiro == segundo || primeiro == terceiro || segundo == terceiro){
            System.out.print("GÊMEOS");
        } else{
            System.out.print("APENAS IRMÃOS");
        }
    }

    public static void main(String[] args) {
        new Uni4Exe11();
    }
}
