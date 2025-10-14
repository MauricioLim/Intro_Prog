import java.util.Scanner;

public class Questao2 {
    Scanner teclado = new Scanner(System.in);
    double notaBai, notaMed, notaAlta;
    double nota1, nota2, nota3;

    public Questao2(){
        entrada();
        ordenacao();   
        menu();

    }

    public void entrada(){
        System.out.println("Digite as três notas:");
        
        this.nota1 = teclado.nextDouble();
        this.nota2 = teclado.nextDouble();
        this.nota3 = teclado.nextDouble();
        System.out.println();
    }

    public void ordenacao(){
        if (this.nota1 < this.nota2 && this.nota1 < this.nota3 && this.nota2 < this.nota3) {
            this.notaBai = this.nota1;
            this.notaMed = this.nota2;
            this.notaAlta = this.nota3;
        } else if (this.nota1 < this.nota2 && this.nota1 < this.nota3 && this.nota3 < this.nota2){
            this.notaBai = this.nota1;
            this.notaMed = this.nota3;
            this.notaAlta = this.nota2;
        } else if (this.nota2 < this.nota1 && this.nota2 < this.nota3 && this.nota1 < this.nota3){
            this.notaBai = this.nota2;
            this.notaMed = this.nota1;
            this.notaAlta = this.nota3;
        } else if (this.nota2 < this.nota1 && this.nota2 < this.nota3 && this.nota3 < this.nota1){
            this.notaBai = this.nota2;
            this.notaMed = this.nota3;
            this.notaAlta = this.nota1;
        } else if (this.nota3 < this.nota1 && this.nota3 < this.nota2 && this.nota1 < this.nota2){
            this.notaBai = this.nota3;
            this.notaMed = this.nota1;
            this.notaAlta = this.nota2;
        } else if (this.nota3 < this.nota1 && this.nota3 < this.nota2 && this.nota2 < this.nota1){
            this.notaBai = this.nota3;
            this.notaMed = this.nota2;
            this.notaAlta = this.nota1;
        }

        notaAlta += 0.3;
        notaMed += 0.2;
        notaBai += 0.1;
    }

    public void menu(){
        System.out.println("_Menu: \na) média simples \nb) média ponderada");
        char op = teclado.next().charAt(0);
        System.out.println();
        
        switch (op) {
            case 'a':
                mediaSimples();
                break;
            case 'b':
                mediaPoderada();
            default:
                System.out.println("Valor inválido do Menu");
                break;
        }
    }

    public void mediaSimples(){
        System.out.println("O valor da media simples do aluno: " + ((this.notaBai + this.notaMed + this.notaAlta) / 3));
    }

    public void mediaPoderada(){
        double media = (this.notaBai * 0.2) + (this.notaMed * 0.3) + (this.notaAlta * 0.5);
        System.out.println("O valor da média ponderada do aluno: " + media);
    }

    public static void main(String[] args) {
        new Questao2();
    }


}
