import java.util.Scanner;

public class Uni4Exe24 {
    Scanner teclado = new Scanner(System.in);
    private int valor1, valor2, valor3, opcao;

    public Uni4Exe24(){
        entrada();
        escreve();
    }

    public void entrada(){
        System.out.print("Valor 1: ");
        this.valor1 = teclado.nextInt();

        System.out.print("Valor 2: ");
        this.valor2 = teclado.nextInt();

        System.out.print("Valor 3: ");
        this.valor3 = teclado.nextInt();

        System.out.println("Opção: \n1 -  escreva os 3 valores em ordem crescente \n2 - escreva os 3 valores em ordem decrescente \n3 - escreva os 3 valores de forma que o maior valor fique no meio");
        this.opcao = teclado.nextInt();
    }

    public void escreve(){
        
        switch (this.opcao) {
            case 1:
                crescente();
                break;
            case 2:
                decrescente();
                break;
            case 3:
                meio();
                break;
            default:
                System.out.print("Opção invalida");                
                break;
        }

      
    }

    public void crescente(){
        if (this.valor1 < this.valor2 && this.valor1 < this.valor3 && this.valor2 < this.valor3){
            System.out.print(this.valor1 + " " + this.valor2 + " " + this.valor3);
        } else if(this.valor1 < this.valor2 && this.valor1 < this.valor3 && this.valor3 < this.valor2){
            System.out.print(this.valor1 + " " + this.valor3 + " " + this.valor2);
        } else if(this.valor2 < this.valor1 && this.valor2 < this.valor3 && this.valor1 < this.valor3){
            System.out.print(this.valor2 + " " + this.valor1 + " " + this.valor3);
        } else if(this.valor2 < this.valor1 && this.valor2 < this.valor3 && this.valor3 < this.valor1){
            System.out.print(this.valor2 + " " + this.valor3 + " " + this.valor1);
        } else if(this.valor3 < this.valor1 && this.valor3 < this.valor3 && this.valor1 < this.valor2){
            System.out.print(this.valor3 + " " + this.valor1 + " " + this.valor2);
        } else{
            System.out.print(this.valor3 + " " + this.valor2 + " " + this.valor1);
        }
    }

    public void decrescente(){
        if (this.valor1 < this.valor2 && this.valor1 < this.valor3 && this.valor2 < this.valor3){
            System.out.print(this.valor3 + " " + this.valor2 + " " + this.valor1);
        } else if(this.valor1 < this.valor2 && this.valor1 < this.valor3 && this.valor3 < this.valor2){
            System.out.print(this.valor2 + " " + this.valor3 + " " + this.valor1);
        } else if(this.valor2 < this.valor1 && this.valor2 < this.valor3 && this.valor1 < this.valor3){
            System.out.print(this.valor3 + " " + this.valor1 + " " + this.valor2);
        } else if(this.valor2 < this.valor1 && this.valor2 < this.valor3 && this.valor3 < this.valor1){
            System.out.print(this.valor1 + " " + this.valor3 + " " + this.valor2);
        } else if(this.valor3 < this.valor1 && this.valor3 < this.valor3 && this.valor1 < this.valor2){
            System.out.print(this.valor2 + " " + this.valor1 + " " + this.valor3);
        } else{
            System.out.print(this.valor1 + " " + this.valor2 + " " + this.valor3);
        }
    }

    public void meio(){
        if (this.valor1 < this.valor2 && this.valor1 < this.valor3 && this.valor2 < this.valor3){
            System.out.print(this.valor2 + " " + this.valor3 + " " + this.valor1);
        } else if(this.valor1 < this.valor2 && this.valor1 < this.valor3 && this.valor3 < this.valor2){
            System.out.print(this.valor3 + " " + this.valor2 + " " + this.valor1);
        } else if(this.valor2 < this.valor1 && this.valor2 < this.valor3 && this.valor1 < this.valor3){
            System.out.print(this.valor1 + " " + this.valor3 + " " + this.valor2);
        } else if(this.valor2 < this.valor1 && this.valor2 < this.valor3 && this.valor3 < this.valor1){
            System.out.print(this.valor3 + " " + this.valor1 + " " + this.valor2);
        } else if(this.valor3 < this.valor1 && this.valor3 < this.valor3 && this.valor1 < this.valor2){
            System.out.print(this.valor1 + " " + this.valor2 + " " + this.valor3);
        } else{
            System.out.print(this.valor2 + " " + this.valor1 + " " + this.valor3);
        }
    }
    public static void main(String[] args) {
        new Uni4Exe24();
    }
}
