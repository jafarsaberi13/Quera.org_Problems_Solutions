import java.util.Scanner;

public class Math {
    public static boolean completeSquare(int n ) {
        double sq = java.lang.Math.sqrt(n);
        int number = (int) sq;
        if (number * number == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[][] arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int con = 1;
        int top = 0, left = 0, right = num - 1, bottom = num - 1;  // Boundaries

        int total = 0, score = 0;
        int[] array = new int[num * num];
        int number = 0;
        while (con <= java.lang.Math.ceil(num / 2.0)) {

            for (int i = left; i <= right; i++) {
                total += arr[top][i];
                array[number] = total;
                number++;
            }
            top++;


            for (int i = top; i <= bottom; i++) {
                total += arr[i][right];
                array[number] = total;
                number++;
            }
            right--;


            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    total += arr[bottom][i];
                    array[number] = total;
                    number++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    total += arr[i][left];
                    array[number] = total;
                    number++;
                }
                left++;
            }

            con++;
        }

        for (int i = 0; i < num * num ; i++) {
            boolean c = completeSquare(array[i]);
            if (c) {
                score++;
            }
        }
        System.out.println(score);
    }
}