import java.util.Scanner;

public class Uni4Exe16 {
    Scanner teclado = new Scanner(System.in);
    private int idadeHom1, idadeHom2, idadeMul1, idadeMul2;
    
    public Uni4Exe16(){
        entrada();
        soma();

    }

    public void entrada(){
        System.out.print("Informe a idade do primeiro homem: ");
        this.idadeHom1 = teclado.nextInt();

        System.out.print("Informe a idade do segundo homem: ");
        this.idadeHom2 = teclado.nextInt();
    
        System.out.print("Informe a idade da primeira mulher: ");
        this.idadeMul1 = teclado.nextInt();

        System.out.print("Informe a idade da segunda mulher: ");
        this.idadeMul2 = teclado.nextInt();
    }

    public void soma(){
        if (this.idadeHom1 < this.idadeHom2 && this.idadeMul1 < this.idadeMul2){
            System.out.print("Soma: " + (idadeHom2 + idadeMul1) + " Produto: " + (idadeHom1 * idadeMul2));
        } else if(this.idadeHom1 < this.idadeHom2 && this.idadeMul2 < this.idadeMul1){
            System.out.print("Soma: " + (idadeHom2 + idadeMul2) + " Produto: " + (idadeHom1 * idadeHom1));
        } else if(this.idadeHom2 < this.idadeHom1 && this.idadeMul1 < this.idadeMul2){
            System.out.print("Soma: " + (idadeHom1 + idadeMul1) + " Produto: " + (idadeHom2 * idadeMul2));
        } else {
            System.out.print("Soma: " + (idadeHom1 + idadeMul2) + " Produto: " + (idadeHom2 * idadeMul1));
        }
    }

    public static void main(String[] args) {
        new Uni4Exe16();
    }
}
