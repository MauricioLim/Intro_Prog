import java.util.Random;
import java.util.Scanner;

public class App {

    public App(){
        //Scanner teclado = new Scanner(System.in);
        char[][] posicao = new char[8][8];

        posicao = preencherVetor(posicao);
        posicao = posicionarNavios(posicao);
        mostrar(posicao);

    }

    private char[][] posicionarNavios(char[][] posicao) {
        int linha = 0;
        int coluna = 0;
        int sentido =  0;

        Random random = new Random();

        //LOOP PARA ADICIONAR OS SUBMARINOS
        for (int i = 0; i < 4; i++) {
           do {
            linha = random.nextInt(8);
            coluna = random.nextInt(8);
            } while (posicao[linha][coluna] != '~');

            posicao[linha][coluna] = 'S';
        }

        //LOOP PARA ADICIONAR OS DESTROYERS
        for (int i = 0; i < 3; i++) {
            boolean posicionado = true;

            do {
                linha = random.nextInt(8);     
                coluna = random.nextInt(8);    
                sentido = random.nextInt(2);   // 0 = horizontal, 1 = vertical

                //VERIFICA SE É POSSIVEL ADICIONAR HORIZONTALMENTE
                if (sentido == 0) {
                    if (coluna + 1 < 8 && posicao[linha][coluna] == '~' && posicao[linha][coluna + 1] == '~') {
                        posicao[linha][coluna] = 'D';
                        posicao[linha][coluna + 1] = 'D';
                        posicionado = true;
                    } else if (coluna - 1 >= 0 && posicao[linha][coluna] == '~' && posicao[linha][coluna - 1] == '~') {
                        posicao[linha][coluna] = 'D';
                        posicao[linha][coluna - 1] = 'D';
                        posicionado = true;
                    } else{
                        posicionado = false; // nenhuma direção possível → repete o loop
                    }   
                }else { //TENTA ADICIONAR VERTICALMENTE
                    if (linha + 1 < 8 && posicao[linha][coluna] == '~' && posicao[linha + 1][coluna] == '~') {
                        posicao[linha][coluna] = 'D';
                        posicao[linha + 1][coluna] = 'D';
                        posicionado = true;
                    } else if (linha - 1 >= 0 && posicao[linha][coluna] == '~' && posicao[linha - 1][coluna] == '~') {
                        posicao[linha][coluna] = 'D';
                        posicao[linha - 1][coluna] = 'D';
                        posicionado = true;
                    } else {
                        posicionado = false; 
                    }
                }
            } while (!posicionado);
        }

        //LOOP PARA ADICIONAR OS CRUZADORES
        for (int i = 0; i < 2; i++) {
            boolean posicionado = true;

            do {
                linha = random.nextInt(8);     
                coluna = random.nextInt(8);    
                sentido = random.nextInt(2);   // 0 = horizontal, 1 = vertical

                //VERIFICA SE É POSSIVEL ADICIONAR HORIZONTALMENTE
                if (sentido == 0) {
                    if (coluna + 2 < 8 && posicao[linha][coluna] == '~' && posicao[linha][coluna + 1] == '~' && posicao[linha][coluna + 2] == '~') {
                        posicao[linha][coluna] = 'C';
                        posicao[linha][coluna + 1] = 'C';
                        posicao[linha][coluna + 2] = 'C';
                        posicionado = true;
                    } else if (coluna - 2 >= 0 && posicao[linha][coluna] == '~' && posicao[linha][coluna - 1] == '~' && posicao[linha][coluna - 2] == '~') {
                        posicao[linha][coluna] = 'C';
                        posicao[linha][coluna - 1] = 'C';
                        posicao[linha][coluna - 2] = 'C';
                        posicionado = true;
                    } else{
                        posicionado = false; // nenhuma direção possível → repete o loop
                    }   
                } else { //TENTA ADICIONAR VERTICALMENTE
                    if (linha + 2 < 8 && posicao[linha][coluna] == '~' && posicao[linha + 1][coluna] == '~' && posicao[linha + 2][coluna] == '~') {
                        posicao[linha][coluna] = 'C';
                        posicao[linha + 1][coluna] = 'C';
                        posicao[linha + 2][coluna] = 'C';
                        posicionado = true;
                    } else if (linha - 2 >= 0 && posicao[linha][coluna] == '~' && posicao[linha - 1][coluna] == '~' && posicao[linha - 2][coluna] == '~') {
                        posicao[linha][coluna] = 'C';
                        posicao[linha - 1][coluna] = 'C';
                        posicao[linha - 2][coluna] = 'C';
                        posicionado = true;
                    } else {
                        posicionado = false; 
                    }
                }
            } while (!posicionado);
        }

        boolean posicionado = true;
        do {
            linha = random.nextInt(8);     
            coluna = random.nextInt(8);    
            sentido = random.nextInt(2);   // 0 = horizontal, 1 = vertical
            //VERIFICA SE É POSSIVEL ADICIONAR HORIZONTALMENTE
            if (sentido == 0) {
                if (coluna + 3 < 8 && posicao[linha][coluna] == '~' && posicao[linha][coluna + 1] == '~' && posicao[linha][coluna + 2] == '~' && posicao[linha][coluna + 3] == '~') {
                    posicao[linha][coluna] = 'P';
                    posicao[linha][coluna + 1] = 'P';
                    posicao[linha][coluna + 2] = 'P';
                    posicao[linha][coluna + 3] = 'P';
                    posicionado = true;
                } else if (coluna - 3 >= 0 && posicao[linha][coluna] == '~' && posicao[linha][coluna - 1] == '~' && posicao[linha][coluna - 2] == '~' && posicao[linha][coluna - 3] == '~') {
                    posicao[linha][coluna] = 'P';
                    posicao[linha][coluna - 1] = 'P';
                    posicao[linha][coluna - 2] = 'P';
                    posicao[linha][coluna - 3] = 'P';
                    posicionado = true;
                } else{
                    posicionado = false; // nenhuma direção possível → repete o loop
                }   
            } else { //TENTA ADICIONAR VERTICALMENTE
                if (linha + 3 < 8 && posicao[linha][coluna] == '~' && posicao[linha + 1][coluna] == '~' && posicao[linha + 2][coluna] == '~' && posicao[linha + 3][coluna] == '~') {
                    posicao[linha][coluna] = 'P';
                    posicao[linha + 1][coluna] = 'P';
                    posicao[linha + 2][coluna] = 'P';
                    posicao[linha + 3][coluna] = 'P';
                    posicionado = true;
                } else if (linha - 3 >= 0 && posicao[linha][coluna] == '~' && posicao[linha - 1][coluna] == '~' && posicao[linha - 2][coluna] == '~' && posicao[linha - 3][coluna] == '~') {
                    posicao[linha][coluna] = 'P';
                    posicao[linha - 1][coluna] = 'P';
                    posicao[linha - 2][coluna] = 'P';
                    posicao[linha - 3][coluna] = 'P';
                    posicionado = true;
                } else {
                    posicionado = false; 
                }
            }
            } while (!posicionado);


        return posicao;
    }

    private void mostrar(char[][] posicao) {
        System.out.println("  1 2 3 4 5 6 7 8");
        for (int i = 0; i < posicao.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < posicao.length; j++) {
                System.out.print(posicao[i][j] + " ");
            }
            System.out.println();
        }
    }

    private char[][] preencherVetor(char[][] posicao) {
        for (int i = 0; i < posicao.length; i++) {
            for (int j = 0; j < posicao.length; j++) {
                posicao[i][j] = '~';
            }
        }
        return posicao;
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}
