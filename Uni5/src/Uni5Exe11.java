public class Uni5Exe11 {
    public static void main(String[] args) {
        int qtd = 0;
        int quebra = 1;

        for (int i = 0; i < 16 ; i++) {
            qtd += quebra;
            System.out.println("[Hora + "+ i + " ] " + qtd);
            quebra *= 3;
        }

        System.out.println(qtd);
    }
}
