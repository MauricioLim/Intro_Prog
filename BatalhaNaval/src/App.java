import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class App {

    public App(){
        Scanner teclado = new Scanner(System.in);
        char[][] posicao = new char[8][8];
        char[][] jogador = new char[8][8];
        

        posicao = preencherVetor(posicao);
        posicao = posicionarNavios(posicao);
        jogador = preencherVetor(jogador);

        jogadas(jogador, teclado, posicao);

    }

    private String taxaAcerto(int acertos, int tentativas){
        DecimalFormat df = new DecimalFormat("0.00");
        
        if (tentativas == 0) {
            return "0.00";
        }
        
        double taxa = (double) acertos / tentativas * 100;
        return df.format(taxa);
    }

    private void jogadas(char[][] jogador, Scanner teclado, char[][] posicao) {
        int linha = 0;
        int coluna = 0;
        int tentativas = 0;
        int destruidos = 0;
        int portaAvioes = 0;
        int cruzador = 0;
        int destroyer = 0;
        boolean[][] jogadas = new boolean[8][8];
        int acertos = 0;
        int erros = 0;

        int portaAvioesDestruidos = 0;
        int cruzadorDestruidos = 0;
        int destroyerDestruidos = 0;
        int submarinosDestruidos = 0;


        do{ //TENTATIVAS DO USUÁRIO 
            do { //VALIDAÇÃO DE LINHAS E COLUNAS
                System.out.println();
                System.out.println("Tentativa "+ tentativas +"/30 | Acertos: "+ acertos + " | Taxa: " + taxaAcerto(acertos, tentativas));
                System.out.println();
                mostrar(jogador);
                System.out.println();
                System.out.print("Digite a linha (0-7): ");
                linha = teclado.nextInt();
                System.out.print("Digite a coluna (0-7): ");
                coluna = teclado.nextInt();

                if (linha < 0 || linha > 7 || coluna < 0 || coluna > 7) {
                    System.out.println("Posição inválida! Digite valores entre 0 e 7.");
                }else if (jogadas[linha][coluna]) {
                    System.out.println("Você já jogou nessa posição.");
                }

            } while (linha < 0 || linha > 7 || coluna < 0 || coluna > 7 || jogadas[linha][coluna]);
            //ADICONA A POSICAO JOGADA
            jogadas[linha][coluna] = true;
            
            if (posicao[linha][coluna] != '~') {
                acertos++;

                System.out.println("ACERTOU! Um navio foi atingido");
                jogador[linha][coluna] = 'A';
                //VERIFICA O QUE FOI ACERTADO
                if (posicao[linha][coluna] == 'P') {
                    portaAvioes += 1;
                }
                if (posicao[linha][coluna] == 'C') {
                    cruzador += 1;
                }
                if (posicao[linha][coluna] == 'D') {
                    destroyer += 1;
                }
                if (posicao[linha][coluna] == 'S') {
                    System.out.println("AFUNDOU! Você destruiu um Submarino");
                    destruidos ++;
                    submarinosDestruidos += 1;
                }
                //MENSAGEM DE AFUNDAR UM NAVIO COM MAIS DE UMA CELULA
                if (portaAvioes == 4) {
                    System.out.println("AFUNDOU! Você destruiu um Destroyer");
                    destruidos ++;
                    portaAvioes = 0;
                    portaAvioesDestruidos += 1;
                }else if (cruzador == 3) {
                    System.out.println("AFUNDOU! Você destruiu um Cruzador");
                    destruidos ++;
                    cruzador = 0;
                    cruzadorDestruidos += 1;
                }else if (destroyer == 2) {
                    System.out.println("AFUNDOU! Você destruiu um Destroyer");
                    destruidos ++;
                    destroyer = 0;
                    destroyerDestruidos += 1;
                }
                tentativas++;
            } else{
                System.out.print("ERROU! Nenhum navio atingido");
                jogador[linha][coluna] = 'X';
                tentativas++; 
                erros++;
            }
        }while(tentativas < 30 && destruidos < 10);

        fimDeJogo(acertos, destruidos, erros, posicao, tentativas, destroyerDestruidos, portaAvioesDestruidos, submarinosDestruidos, cruzadorDestruidos);

    }

    private void fimDeJogo(int acertos, int destruidos, int erros, char[][] posicao, int tentativas, int destroyerDestruidos, int portaAvioesDestruidos, int submarinosDestruidos, int cruzadorDestruidos) {
        System.out.println();
        mostrar(posicao);
        System.out.println();
        System.out.println("====================================");
        System.out.println("         ESTATISTICAS FINAIS      ");
        System.out.println("====================================");
        System.out.println();

        if (tentativas == 30 && destruidos == 10) {
            System.out.println("Status: VITORIA!");
        } else if (tentativas == 30 && destruidos != 10) {
            System.out.println("Status: DERROTA!");
        }

        System.out.println("Tentativas usadas: " + tentativas + "/30");
        System.out.println("Total de acertos: " + acertos);
        System.out.println("Total de erros: " + erros);
        System.out.println("Taxa de acerto: " + taxaAcerto(acertos, tentativas));
        System.out.println();
        System.out.println("Navios afundados: "+ destruidos +"/10");

        System.out.println(" - Porta-aviões: "+ portaAvioesDestruidos + "/1");
        System.out.println(" - Cruzadores: "+ cruzadorDestruidos + "/2");
        System.out.println(" - Destroyers: "+ destroyerDestruidos + "/3");
        System.out.println(" - Submarinos: "+ submarinosDestruidos + "/4");

        System.out.println();
        System.out.println("PONTUACAO FINAL: " + pontuacao(acertos, destruidos, erros, tentativas) + " pontos");
        System.out.println( "- Acertos: " + acertos + " x 10 = " + (acertos * 10));
        System.out.println( "- Navios afundados: " + destruidos + " x 50 = " + (destruidos * 50));
        System.out.println( "- Penalidades erros: " + erros + " x -2 = " + (erros * -2));
        if (tentativas < 25){
            System.out.println("- Bônus vitória rápida: +100");
        }
        System.out.println("Classificação: " + classificacao(pontuacao(acertos, cruzadorDestruidos, erros, tentativas)));

    }

    private String classificacao(int pontuacao) {
        if (pontuacao > 400) {
            return "Excelente";
        } else if(pontuacao > 299 && pontuacao < 401){
            return "Bom";
        } else if(pontuacao > 199 && pontuacao < 300){
            return "Regular";
        } else{
            return "Precisa melhorar";
        }
    }

    private int pontuacao(int acertos, int destruidos, int erros, int tentativas) {
        if(tentativas < 25){
            return ((acertos * 10) + (destruidos * 50) - (erros * 2) + 100);
        } else{
            return ((acertos * 10) + (destruidos * 50) - (erros * 2));
        }
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
