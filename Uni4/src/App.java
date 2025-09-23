import java.util.Scanner;

public class App {

    public static double media(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double n1 = teclado.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = teclado.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = teclado.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double n4 = teclado.nextDouble();

        return (n1+n2+n3+n4) / 4;
    }

    public static String passou(){
        double media = media();
        if (media > 6) {
            return "Passou com a media " + media;
        } else{
            return "Reprovou";
        }
    }

    public static String validacao(int idade){
        if (idade <= 2){
            return "Bebê";
        } else if (idade > 2 && idade <= 11 ){
            return "Criança";
        } else if (idade > 11 && idade <= 14) {
            return "Pré-adolescente";
        } else if (idade > 14 && idade <=18 ) {
            return "Adolescente";
        } else if(idade > 18 && idade <=25){
            return "Jovem";
        } else if (idade > 25 && idade <= 59) {
            return "Adulto";
        } else if(idade > 58){
            return "Idoso";
        } else{
            return "Idade invalida";
        }
    }

    

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int idade = teclado.nextInt();

        System.out.println(validacao(idade));

        teclado.close();
    }
}
