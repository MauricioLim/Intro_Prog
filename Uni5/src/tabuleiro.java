public class tabuleiro {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("  ---------------------------------");
        for (int i = 0; i < 8; i++) {
            System.out.print(8 - i + " ");
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 == 0){
                    System.out.print("| B ");  
                } else if (i % 2 == 0 && j % 2 == 1){
                    System.out.print("| P ");
                } else if (i % 2 == 1 && j % 2 == 0){
                    System.out.print("| P ");  
                } else if (i % 2 == 1 && j % 2 == 1){
                    System.out.print("| B ");
                }
            }
            System.out.print("|");
            System.out.println();
            System.out.println("  ---------------------------------");
        }
        System.out.println("    A   B   C   D   E   F   G   H");
        System.out.println();
    }
}
