public class Uni5Exe04 {
    public static void main(String[] args) {
        float divisor = 2;
        int aumento = 4;
        float valor = 0; 
    
        for(int i = 3; i <= 41; i+= 2){
            valor += i / divisor;
            divisor += aumento;
            aumento += 2;
        }

        System.out.println(valor);
    }
}
