import java.util.ArrayList;
import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> result = new ArrayList<>();
        ArrayList<Integer> pre = new ArrayList<>();
        pre.add(1);

        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            ArrayList<Integer> current = new ArrayList<>();
            current.add(1);

            for (int j = 1; j < i; j++) {
                int tmp = pre.get(j - 1) + pre.get(j);
                current.add(tmp);
            }
            if (i > 0) {
                current.add(1);
            }
            pre = current;
        }
        //System.out.println(pre);
        String strX, strY;
        for (int i = 0; i < n + 1; i++) {
            if (i == 0) {
                if ((n - i) >= 10) {

                    strX = "x^" + "{" + (n - i) + "}";
                    result.add(strX);
                } else {
                    if ((n - i) != 1) {
                        strX = "x^" + (n - i);
                    } else {
                        strX = "x";
                    }
                    result.add(strX);
                }
            } else if (i == n) {
                if (i >= 10) {
                    strY = "y^" + "{" + i + "}";
                    result.add(strY);
                } else {
                    if (i != 1) {
                        strY = "y^" + (i);
                    } else {
                        strY = "y";
                    }
                    result.add(strY);
                }
            } else {
                if ((n - i) >= 10) {
                    strX = "" + pre.get(i) + "x^" + "{" + (n - i) + "}";
                    if (i != 1) {
                        if (i >= 10) {
                            strY = "y^" + "{" + i + "}";
                        } else {
                            strY = "y^" + (i);
                        }
                    } else {
                        strY = "y";
                    }
                    result.add(strX + strY);
                } else {
                    if ((n - i) != 1) {
                        strX = "" + pre.get(i) + "x^" + (n - i);
                    } else {
                        strX = "" + pre.get(i) + "x";
                    }
                    if (i != 1) {
                        if (i >= 10) {
                            strY = "y^" + "{" + i + "}";
                        } else {
                            strY = "y^" + (i);
                        }
                    } else {
                        strY = "y";
                    }
                    result.add(strX + strY);
                }
            }
        }
        int plus = 1;
        for (int i = 0; i <= n; i++) {
            if (plus == 1) {
                System.out.print(result.get(i));
            }
            else {
                System.out.print("+" + result.get(i));
            }
            plus = 2;
        }
    }
}