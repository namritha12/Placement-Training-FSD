//Execute simple java programs

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i, j, k;

        if (n <= 0) {
            System.out.println("God1:need 7");
            System.out.println("God2:need 7");
            System.out.println("God3:need 7");

            System.out.println("Shortage:" + (21 - n));
        }

        else if (n >= 21) {
            System.out.println("God1:offered 7");
            System.out.println("God2:offered 7");
            System.out.println("God3:offered 7");

            j = n - 21;

            if (j == 0) {
                System.out.println("Sufficient");
            } else {
                System.out.println("Surplus:" + j);
            }
        }

        else if (n >= 7) {
            System.out.println("God1:offered 7");

            i = n - 7;

            if (i >= 7) {
                System.out.println("God2:offered 7");
            }
            else if (i == 0) {
                System.out.println("God2:need 7");
            }
            else {
                System.out.println("God2:have " + i + " need " + (7 - i));
            }

            System.out.println("God3:need 7");
            System.out.println("Shortage:" + (21 - n));
        }

        else {
            k = 7 - n;

            System.out.println("God1:offered " + n + " need " + k);
            System.out.println("God2:need 7");
            System.out.println("God3:need 7");

            System.out.println("Shortage:" + (21 - n));
        }

        System.out.println("God Bless You!");
        sc.close();
    }
}