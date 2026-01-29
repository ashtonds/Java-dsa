import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 3, cols = 3;
        int[][] arr = new int[rows][cols];

        // Input matrix
        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Number to search
        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        boolean found = false;

        // Search logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Number found at position: Row "
                            + (i + 1) + ", Column " + (j + 1));
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }

        sc.close();
    }
}
