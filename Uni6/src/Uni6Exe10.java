import java.util.Scanner;

public class Uni6Exe10 {

    private Uni6Exe10(){
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[50];
        int posFim = 0;
        System.out.println("\033[H\033[2J");
        int opcao;
        do{
            System.out.println();
            System.out.println("_______________MENU_______________");
            System.out.println();
            System.out.println(" 1 - Incluir valor");
            System.out.println(" 2 - Pesquisar valor");
            System.out.println(" 3 - Alterar valor");
            System.out.println(" 4 - Excluir valor");
            System.out.println(" 5 - Mostrar valores");
            System.out.println(" 6 - Ordenar valores");
            System.out.println(" 7 - Inverter valores");
            System.out.println(" 8 - Incluir valores");
            System.out.println();
            System.out.print(" Opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    posFim = incluir(vet, posFim, teclado);
                    break;
                case 2:
                    pesquisar(vet, posFim, teclado);
                    break;
                case 3:
                    alterar(vet, posFim,  teclado);
                    break;
                case 4:
                    posFim = excluir(vet, posFim, teclado);
                    break;
                case 5:
                    mostrar(vet, posFim);
                    break;
                case 6:
                    ordenar(vet, posFim);
                    break;
                case 7:
                    inverter(vet, posFim);
                    break;
                case 8:
                    System.out.println("______FIM______");
                    break;
                default:
                    System.out.println(" OPÇÃO INVALIDA");
                    break;
            }
        } while(opcao != 8);
    }

    private int incluir(int[] vet, int posFim, Scanner teclado) {   
        if(posFim < vet.length){
            System.out.print(" Valor: ");
            vet[posFim] = teclado.nextInt();
            System.out.println("_Incluido em vet[" + posFim + "].");
            posFim ++;
        } else{
            System.out.println(".. Não incluido - vetor cheio....");
        }

        return posFim;
    }

    private int pesquisar(int[] vet, int posFim, Scanner teclado) {
        System.out.print(" Valor pesquisa: ");
        int valor = teclado.nextInt();
        for (int i = 0; i < posFim; i++){
            if (valor == vet[i]) {
                System.out.println("_ Encontrado vet[" + i +"]");
                return i;
            }
        }
        System.out.println("_ Não encontrado.");
        return -1;
    }

    private void alterar(int[] vet, int posFim, Scanner teclado) {
        int valorId = pesquisar(vet, posFim, teclado);
        if (valorId != -1) {
            System.out.print(" Valor troca:");
            vet[valorId] = teclado.nextInt();
            System.out.println("_ Valor troca vet[" + valorId + "]: " + vet[valorId]);
        }
    }

    private int excluir(int[] vet, int posFim, Scanner teclado) {
        int valorId = pesquisar(vet, posFim, teclado);
        if (valorId != -1){
            for (int i = valorId; i < (posFim-1); i++){
                vet[i] = vet[i + 1];
            }
            posFim--;
            System.out.println(" _ Valor excluido.");
        }

        return posFim;
    }

    private void mostrar(int[] vet, int posFim) {
        System.out.println("__ Vetor Valores __");
        for (int i = 0; i < posFim; i++) {
            System.out.println("vet[" + i + "] = " + vet[i]);
        }
    }

    private void ordenar(int[] vet, int posFim) {
        int bolha;
        for (int i = 0; i < posFim - 1; i++){
            if (vet[i] > vet[i + 1]) {
               bolha = vet[i];
               vet[i] = vet[i + 1];
               vet[i + 1] = bolha;
               i = -1; 
            }
        }

        System.out.println("_ Vetor ordenado");
    }

    private void inverter(int[] vet, int posFim) {
        int bolha;
        for (int i = 0; i < posFim - 1; i++){
            bolha = vet[i];
            vet[i] = vet[(posFim - 1) - i];
            vet[(posFim - 1) - i] = bolha;
        }

        System.out.println("_ Vetor invertido");
    }

    public static void main(String[] args) {
        new Uni6Exe10();
    }
}
