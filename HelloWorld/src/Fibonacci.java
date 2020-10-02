public class Fibonacci {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return (fib(n-1) + fib(n-2));
        }
    }
    public void fibPrint(int n) {
        Printer p = new Printer();
        for (int i = 0; i < n; i++) {
            p.print(Integer.toString(fib(i)));
        }
    }
}
