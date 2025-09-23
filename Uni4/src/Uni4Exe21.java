import java.util.Scanner;

public class Uni4Exe21 {
    Scanner teclado = new Scanner(System.in);
    private double massa, altura, imc;

    public Uni4Exe21(){
        entrada();
        calcula();
        mostra();
    }

    public void entrada(){
        System.out.print("Digite a altura: ");
        this.altura = teclado.nextDouble();

        System.out.print("Digite a massa: ");
        this.massa = teclado.nextDouble();
    }

    public void calcula(){
        this.imc = this.massa / Math.pow(this.altura, 2);
    }

    public void mostra(){
        if (this.imc < 18.5){
            System.out.print("Magreza");
        } else if(this.imc >= 18.5 && this.imc <= 24.9){
            System.out.print("Saudável");
        } else if(this.imc >= 25 && this.imc <= 29.9){
            System.out.print("Sobrepeso");
        } else if(this.imc >=30 && this.imc <=34.9){
            System.out.print("Obesidade Grau I");
        } else if(this.imc >= 35 && this.imc <= 39.9){
            System.out.print("Obesidade Grau II (severa)");
        } else if(this.imc >=40){
            System.out.print("Obesidade Grau III (mórbida)");
        }
    }    

    public static void main(String[] args) {
        new Uni4Exe21();
    }
}
