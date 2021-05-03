import java.util.ArrayList;

public class TestType<T> {
    private T[] arr;

    public TestType(T... arr) {
        this.arr = arr;
    }

    public void swapElements(int i, int j) {
        T elem;
        elem = arr[i - 1];
        arr[i - 1] = arr[j - 1];
        arr[j - 1] = elem;
    }

    public void showArr(){
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void reformat() {
        ArrayList<T> newFormat = new ArrayList<>();
        for (T a : arr) {
            newFormat.add(a);
        }
        System.out.println(newFormat);
    }
}
