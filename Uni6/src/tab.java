public class tab {
    public static void main(String[] args) {
        String vetor[][] = {{"_|", "_|" + "_|"}, {"_|", "_|" + "_|"}};

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if(j == vetor.length - 1){
                    vetor[i][j] = "_";
                }
                System.out.print(vetor[i][j]);
            }
            System.out.println();
        }

    }
}
