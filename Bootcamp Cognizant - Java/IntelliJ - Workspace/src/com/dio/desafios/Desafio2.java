public class Desafio2 {
    public static void main(String[] args) {
        final int HORIZONTAL = 39;
        final int VERTICAL = 5;

        for(int i = 0; i < HORIZONTAL; i++){
            System.out.print("-");
        }
        System.out.print("\n");

        for(int i = 0; i < VERTICAL; i++){
            System.out.print("|");
            for(int j = 0; j < HORIZONTAL-2; j++){
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.print("\n");
        }
        for(int i = 0; i < HORIZONTAL; i++){
            System.out.print("-");
        }
    }
}
