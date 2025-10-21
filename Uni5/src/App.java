import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // for(int i = 1; i < 11; i++){
        //     System.out.println("Número: " + i);
        // }

        // for(int i = 10; i >= 0; i--){
        //     System.out.println("Número: " + i);
        // }

        // for(int i = 1; i < 11; i+=2){
        //     System.out.println("Número: " + i);
        // }

        // int total = 0;
        // int totalImp = 0;
        // for(int i = 0; i <= 1472; i++){
        //     if (i % 2 == 0){
        //         total++;
        //     } else{
        //         totalImp++;
        //     }
        // }
        // System.out.println(total);
        // System.out.println(totalImp);

        // int numero = 0;
        // for (int i = 1; i <= 10; i++){
        //     boolean primo = false;

        //     for (int j = 2; j < i; j++) {
        //         if (i % j ==0){
        //             primo = false;
        //         }
        //     }

        //     numero++;
        // }

        // System.out.println(numero);

        System.out.println();
        System.out.println();
    
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         if((i ==  0 && j == 0) || (i == 1 && j == 0) || (i == 2 && j == 0) || (i == 0 && j == 1) || (i == 2 && j == 2) ){
        //             System.out.print("| x ");                    
        //         } else {
        //             System.out.print("| O ");
        //         }
                    
        //     }

        //     System.out.println();
        //     System.out.println("------------");
        // }

        // System.out.println();
        // System.out.println();


        boolean temSaldoCartao = true;
        while (temSaldoCartao) {
            System.out.println("Tem comida");
            System.out.println("Tem chopp");
            temSaldoCartao = false;
        }

        double saldoDoCartao = 200.0;
        while (saldoDoCartao >= 16){
            System.out.println("Mais um chopp");
            saldoDoCartao -= 16; 
        }

        int menu = 0;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Menu");
            System.out.println("1 - Contar");
            System.out.println("2 - Somar");
            System.out.println("3 - Dividir");
            System.out.println("9 - sair");

            menu = teclado.nextInt();
        } while(menu != 9);
            
    }



}
