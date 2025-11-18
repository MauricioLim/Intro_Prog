import java.util.Scanner;

public class Prova2 {

    private Prova2(){
        Scanner teclado = new Scanner(System.in);
        int posFim = 0;

        String maior = "";

        System.out.print("Tamanho máximo da agenda: ");
        String[] nome = new String[teclado.nextInt()];
        int[] telefone = new int[nome.length];
        System.out.print("Limite máxido de dígitos totais: ");
        int limite = teclado.nextInt();
        teclado.nextLine();

        int opcao;
        do{
            System.out.println();
            System.out.println("_______________MENU_______________");
            System.out.println();
            System.out.println(" 1 - Adicionar Contato");
            System.out.println(" 2 - Mostrar agenda (Invertida)");
            System.out.println(" 3 - Maior contato");
            System.out.println(" 4 - Ordenar agenda");
            System.out.println(" 5 - Remover contato");
            System.out.println(" 6 - Sair");
            System.out.println();
            System.out.print(" Opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    posFim = adicionarContato(nome, telefone, limite, posFim, teclado);
                    break;
                case 2:
                    imprimirAgenda(nome, telefone, posFim);
                    break;
                case 3:
                    maior = maiorContato(nome, telefone);
                    break;
                case 4:
                    ordenarAgenda(nome, telefone, posFim);
                    break;
                case 5:
                    posFim = removerContato(nome, telefone, posFim, teclado);
                    break;
                case 6:
                    System.out.println("______FIM______");
                    break;
                default:
                    System.out.println(" OPÇÃO INVALIDA");
                    break;
            }
        } while(opcao != 6);
    }

    private int removerContato(String[] nome, int[] telefone, int posFim, Scanner teclado) {
        String tempNome = "";
        
        System.out.print("Informe o nome do contato que deseja remover: ");
        tempNome = teclado.nextLine();

        for (int i = 0; i < posFim - 1; i++) {
            if (nome[i].equals(tempNome.toLowerCase())) {
                for (int j = 0; j < posFim - 1; j++){
                    nome[j] = nome[j + 1];
                    telefone[j] = telefone[j + 1];
                }
                return posFim --;
            }
        }
        System.out.println("Contato não encontrado!");
        return posFim;
    }

    private void ordenarAgenda(String[] nome, int[] telefone, int posFim) {
        String tempNome = "";
        int tempTelefone = 0;

        for (int i = 0; i < posFim-1; i++) {
            if (telefone[i] > telefone[i + 1]) {
                tempTelefone = telefone[i];
                telefone[i] = telefone[i + 1];
                telefone[i + 1] = tempTelefone;

                tempNome = nome[i];
                nome[i] = nome[i + 1];
                nome[i + 1] = tempNome;

                i = -1;
            }
        }

        for (int i = 0; i < posFim; i++) {
            System.out.println(" Nome: " + nome[i] + " Telefone: " + telefone[i]);
        }
    }

    private String maiorContato(String[] nome, int[] telefone) {
        int soma = 0;
        int temp;
        String maior = "";
        
        for (int i = 0; i < telefone.length; i++) {
            temp = telefone[i];
            if (temp > soma){
                maior = nome[i];
            }
        }

        System.out.println(" Maior número de telefone: " + maior);
        return maior;
    }

    private void imprimirAgenda(String[] nome, int[] telefone, int posFim) {
        for (int i = (posFim - 1); i >= 0; i--) {
            System.out.println(" Nome: " + nome[i] + " Telefone: " + telefone[i]);
        }
    }

    private int verifica(String[] nome, int[] telefone, int digitos){
        int quantidade = 0;
        String temp = "";
        for (int i = 0; i < telefone.length; i++) {
            temp = Integer.toString(telefone[i]);
            if (!(temp.equals("0"))) {
                quantidade += temp.length();
            }
        }

        temp = Integer.toString(digitos);
            if (!(temp.equals("0"))) {
                quantidade += temp.length();
            }

        return quantidade;
    }

    private int adicionarContato(String[] nome, int[] telefone, int limite, int posFim, Scanner teclado) {
        int tempTelefone;
        String tempNome;
        
        System.out.print(" Nome: ");
        tempNome = teclado.nextLine();
        System.out.print(" Número: ");
        tempTelefone = teclado.nextInt();
        
        int quantidade = verifica(nome, telefone, tempTelefone);
        if (quantidade > limite) {
            System.out.println(" Não adicionado! Quantidade de dígitos maior que o permitido!");
            return posFim;
        } else{
            nome[posFim] = tempNome;
            telefone[posFim] = tempTelefone;
            // System.out.println(nome[posFim] + ": " + telefone[posFim]);
            return posFim += 1;
        }
    }

    public static void main(String[] args) {
        new Prova2();
    }
}
