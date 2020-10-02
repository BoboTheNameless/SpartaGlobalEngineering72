import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

public class Loops {
    public void forLoop() {
        Printer p = new Printer();
        for (int i = 0; i < 5; i++) {
            p.print("Hello World!");
        }
    }

    public void whileLoop() {
        int i = 0;
        Printer p = new Printer();
        while (i < 5) {
            p.print("Hello World!");
            i++;
        }
    }
    public void forEachLoop(ArrayList<?> arrayList) {
        Printer p = new Printer();
        for (Object o : arrayList) {
            p.print(o.toString());
        }
    }
}
