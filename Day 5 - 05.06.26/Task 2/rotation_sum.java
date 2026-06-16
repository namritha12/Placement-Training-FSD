import java.util.Scanner;
public class rotation_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        System.out.println("Enter 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Choice 1: 90 degree clockwise\nChoice 2: 90 degree anti-clockwise\nChoice 3: 180 degree clockwise\nChoice 4: 180 degree anti-clockwise\nChoice 5: 270 degree clockwise\nChoice 6: 270 degree anti-clockwise\nEnter your choice");
        int choice = sc.nextInt();
        if (choice == 1 || choice == 2 || choice == 5 || choice == 6) {
            // Transpose
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 3; j++) {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
            // 90 clockwise or 270 anti-clockwise
            if (choice == 1 || choice == 6) {
                for (int i = 0; i < 3; i++) {
                    int l = 0;
                    int r = 2;
                    while (l < r) {
                        int temp = a[i][l];
                        a[i][l] = a[i][r];
                        a[i][r] = temp;
                        l++;
                        r--;
                    }
                }
            }
            // 90 anti-clockwise or 270 clockwise
            if (choice == 2 || choice == 5) {
                for (int j = 0; j < 3; j++) {
                    int l = 0;
                    int r = 2;
                    while (l < r) {
                        int temp = a[l][j];
                        a[l][j] = a[r][j];
                        a[r][j] = temp;
                        l++;
                        r--;
                    }
                }
            }
            System.out.println("The result is");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
        else if (choice == 3 || choice == 4) {
            System.out.println("The result is");
            for (int i = 2; i >= 0; i--) {
                for (int j = 2; j >= 0; j--) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}