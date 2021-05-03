public class Main {
    public static void main(String[] args) {

        TestType arr1 = new TestType("Hello", "my", "small", "lovely", "kitty");
        arr1.reformat();
        arr1.swapElements(3, 4);
        System.out.println();
        arr1.showArr();
    }

}
