import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("N: ");
        int entrada = teclado.nextInt();
        teclado.nextLine();

        String nome = "";
        String nomeMaior = "";
        int idade = 0;
        int qtd = 0;

        for (int i = entrada; i > 0; i-- ){
            nome = teclado.nextLine();
            idade = teclado.nextInt();
            teclado.nextLine();

            if(idade == 18){
                if (i == 1) {
                    nomeMaior += nome;
                } else {
                    nomeMaior += nome + ", ";
                }
            }

            if (idade > 20){
                qtd ++;
            }
        }
        
        System.out.println("Nomes dos alunos que tem 18 anos: " + nomeMaior);
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: " + qtd);

    }
}
