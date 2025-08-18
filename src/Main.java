public class Main {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // result = result * i
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(num + "! = " + factorial(num));
    }
}
