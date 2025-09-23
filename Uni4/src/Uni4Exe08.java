import java.util.Scanner;
public class Uni4Exe08 {
    Scanner teclado = new Scanner(System.in);
    char letra;

    public Uni4Exe08(){
        entrada();
        vogal();
    }

    private void entrada (){
        System.out.print("Informe a letra: ");
        letra = teclado.next().toLowerCase().charAt(0);
    }

    private void vogal(){
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("É vogal");
        } else{
            System.out.println("NÃO é vogal");
        }
    }

    public static void main(String[] args) {
        new Uni4Exe08();
    }
}
