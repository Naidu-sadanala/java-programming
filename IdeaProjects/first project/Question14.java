public class Question14 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int high = 7;
            int low = 1;
            for (int j = 0; j < i; j++) {
                System.out.print("");
            }
            for (int j = 0; j < 7-i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
