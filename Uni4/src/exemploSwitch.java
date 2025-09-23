import java.util.Scanner;

public class exemploSwitch {

    public static String diaNumero(int opção){
        
        switch (opção) {
            case 0:
                return "Domingo";
            case 1:
                return "Segunda-feira";
            case 2:
                return "Terça-feira";
            case 3:
                return "Quarta-feira";
            case 4:
                return "Quinta-feira";
            case 5: 
                return "Sexta-feira";
            case 6:
                return "Sabado";
            default:
                return "Opção invalida!";
        }

    }

    public static String diaTexto(String opção){
        
        switch (opção.toLowerCase()) {
            case "domingo":
                return "0";
            case "segunda":
                return "1";
            case "terca":
                return "2";
            case "quarta":
                return "3";
            case "quinta":
                return "4";
            case "sexta": 
                return "5";
            case "sabado":
                return "6";
            default:
                return "Opção invalida!";
        }

    }

    public static void mensagem(){
        System.out.println("Informe o dia da semana");
        System.out.println(" 0 - Domingo\n 1 - Segunda\n 2 - Terça\n 3 - Quarta\n 4 - Quinta\n 5 - Sexta\n 6 - Sabado");
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println();
        mensagem();
        
        int dia = teclado.nextInt();

        System.out.println(diaNumero(dia));
        
        System.out.println();
        mensagem();

        String diaTex = teclado.next();
        System.out.println(diaTexto(diaTex));




        teclado.close();
    }
    
}
