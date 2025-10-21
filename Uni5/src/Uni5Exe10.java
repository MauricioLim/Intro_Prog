public class Uni5Exe10 {
    public static void main(String[] args) {
        int potencia = 0, soma = 0;
        String numeroX  = "", numeroY  = "";
        int contador = 0;

        for (int x = 0; x < 10000; x++) {
            for (int y = 0; y < 10000; y++) {
                soma = x + y;
                potencia = (int)Math.pow(soma, 2);
                numeroX = x + "" + y;
                numeroY = potencia + "";

                if (numeroX.equals(numeroY)) {
                    contador++;
                    System.out.println("[ " + contador + " ] " + x + " + " + y + " = " + soma + " >> " + potencia);
                    
                }
                if (contador == 10) {
                    break;
                }
            }
            if (contador == 10) {
                break;
            }
        }
    }
}
