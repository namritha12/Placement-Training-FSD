import java.util.*;

public class spiralmatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int r = sc.nextInt();

        System.out.print("Columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter matrix:");

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Source row: ");
        int sr = sc.nextInt();

        System.out.print("Source column: ");
        int scol = sc.nextInt();

        ArrayList<Integer> spiral = new ArrayList<>();

        int top = 0;
        int bottom = r - 1;
        int left = 0;
        int right = c - 1;

        while(top <= bottom && left <= right) {

            for(int i = left; i <= right; i++)
                spiral.add(a[top][i]);
            top++;

            for(int i = top; i <= bottom; i++)
                spiral.add(a[i][right]);
            right--;

            if(top <= bottom) {
                for(int i = right; i >= left; i--)
                    spiral.add(a[bottom][i]);
                bottom--;
            }

            if(left <= right) {
                for(int i = bottom; i >= top; i--)
                    spiral.add(a[i][left]);
                left++;
            }
        }

        int sourceValue = a[sr][scol];

        int start = spiral.indexOf(sourceValue);

        System.out.println("Output:");

        for(int i = start; i < spiral.size(); i++) {
            System.out.print(spiral.get(i) + " ");
        }
        sc.close();
    }
} 
    

