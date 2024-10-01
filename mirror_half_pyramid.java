public class mirror_half_pyramid {
    public static void main(String[] args) {
        int m = 4;
        for (int i = 1; i <= m; i++) {
            // Inner loop for printing spaces
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            // Inner loop for printing stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Move to the next line after printing stars
            System.out.println();
        }
            }
        }
        