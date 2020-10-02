import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Loops l = new Loops();
        l.forLoop();
        printer.print("");
        l.whileLoop();
        printer.print("");
        Swapper s = new Swapper();

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("test");
        ArrayList<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);

        l.forEachLoop(strings);
        printer.print("");
        l.forEachLoop(ints);
        printer.print("");

        int x = 2;
        int y = 3;
        printer.print("x before swap: " + x);
        printer.print("y before swap: " + y);
        int buffer = x;
        x = y;
        y = buffer;

        printer.print("x after swap: " + x);
        printer.print("y after swap: " + y);

        int[] list = {2,3,5,6};

        printer.print("Strings before swapping: " + strings.toString());
        printer.print("Ints before swapping: " + ints.toString());
        printer.print("List before swapping: " + Arrays.toString(list));

        s.swap(ints, 2, 3);
        printer.print("Ints after swapping: " + ints.toString());
        printer.print("");
        s.swap(strings, "World", "Hello");
        printer.print("Strings after swapping: " + strings.toString());
        printer.print("");
        s.swap(ints, 89, 3);
        printer.print("Ints after attempting to swap: " + ints.toString());
        printer.print("");
        s.swap(list,2,3);
        printer.print("List after swapping: " + Arrays.toString(list));
        printer.print("");
        s.swap(list,87,3);
        printer.print("List after attempting to swap: " + Arrays.toString(list));
        printer.print("");



        Summation summation = new Summation();
        printer.print(Integer.toString(summation.sumOdd(5)));
        printer.print("");
        printer.print(Integer.toString(summation.sumEven(5)));
        printer.print("");

        Fibonacci f = new Fibonacci();

        f.fibPrint(20);
    }
}
