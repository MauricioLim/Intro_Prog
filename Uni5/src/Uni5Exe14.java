import java.util.Scanner;

public class Uni5Exe14 {

    Scanner teclado = new Scanner(System.in);

    String nome = "";

    double pc = 0, pv = 0, lucro = 0;
    int qtdDez = 0, qtdDezVin = 0, qtdMaior;
    double totalCompra = 0, totalVenda = 0, totalLucro;

    public Uni5Exe14() {
        loop();
        mostrar();
    }

    public void loop(){
        for (int i = 0; i < 2; i++){
            System.out.print("Item: ");
            nome = teclado.nextLine();

            System.out.print("PC: ");
            this.pc = teclado.nextDouble();
            this.totalCompra += this.pc;

            System.out.print("PV: ");
            this.pv = teclado.nextDouble();
            this.totalVenda += this.pv;

            teclado.nextLine();

            calculo();
            verifica();
        }
    }

    public void calculo(){
        this.lucro = (this.pv - this.pc) / this.pc * 100;
        this.totalLucro += this.lucro/100;
    }

    public double porcentagem(double porce){
        return this.pv * porce;
    }
    
    public void verifica(){
       if (this.lucro < porcentagem(0.1)){
            this.qtdDez++;
        } else if (lucro >= porcentagem(0.1) && lucro <= porcentagem(0.2)){
            this.qtdDezVin++;
        } else if (lucro > porcentagem(0.2)){
            this.qtdMaior++;
        }
    }

    public void mostrar(){
        System.out.println("Qtd itens com lucro < 10 %: " + this.qtdDez);
        System.out.println("Qtd itens com lucro >= 10 % e lucro <= 20% : " + this.qtdDezVin);
        System.out.println("Qtd itens com lucro > 20 %: " + this.qtdMaior);

        System.out.println("Valor total de compra: " + this.totalCompra);
        System.out.println("Valor total de venda: " + this.totalVenda);
        System.out.println("Valor total de lucro: " + this.totalLucro);
    }

    public static void main(String[] args) {
        new Uni5Exe14();
    }
    
}
