public class Summation {
    public int sumOdd(int n) {
        int i = 1;
        Printer p = new Printer();
        int sum = 0;
        while (i <= n) {
            if (i%2 == 1) {
                sum += i;
            }
            i++;
        }
        return sum;
    }

    public int sumEven(int n) {
        int i = 1;
        Printer p = new Printer();
        int sum = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }
}
