import java.util.*;

class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should not be negative");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be be zero");
        } else {
            return ((long) Math.pow(n, p));
        }
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter p: ");
        int p = sc.nextInt();
        MyCalculator c = new MyCalculator();
        try {
            long ans = c.power(n, p);
            System.out.println(n + "^" + p + "=" + ans);
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
