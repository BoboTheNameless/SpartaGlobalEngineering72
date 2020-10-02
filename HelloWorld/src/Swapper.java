import java.util.ArrayList;
import java.util.Collections;

public class Swapper {
    public ArrayList<?> swap(ArrayList<?> arrayList, Object o1, Object o2) {
        try {
            int index1 = arrayList.indexOf(o1);
            int index2 = arrayList.indexOf(o2);
            Collections.swap(arrayList, index1, index2);
        } catch (Exception e) {
            System.err.println("1 or more objects could not be found in the given list. The list has not been altered");
        }
        return arrayList;
    }

    public int[] swap(int [] a, int x, int y) {
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                index1 = i;
            } else if (a[i] == y) {
                index2 = i;
            }
            if (index1 > -1 && index2 > -1)
                break;
        }
        try {
            a[index1] = y;
            a[index2] = x;
        } catch (Exception e) {
            System.err.println("1 or more numbers not found in the array. Array remains unchanged.");
        }
        return a;
    }
}
