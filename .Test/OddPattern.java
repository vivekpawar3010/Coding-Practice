public class OddPattern {
    public static void main(String[] args) {
        // Top half (Rows with 5, 3, 1 elements)
        for (int i = 5; i >= 1; i = i - 2) {
            for (int j = 1; j <= i; j++) {
                // Formula to print odd numbers: 2 * j - 1
                System.out.print((2 * j - 1) + " ");
            }
            System.out.println();
        }
        
        // Bottom half (Rows with 3, 5 elements)
        for (int i = 3; i <= 5; i = i + 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print((2 * j - 1) + " ");
            }
            System.out.println();
        }
    }
}