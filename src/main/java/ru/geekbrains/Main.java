package ru.geekbrains;

public class Main {
    public static void main(String[] args) {
// 1 и 2 пункты домашнего задания - проверка
//        TestType arr1 = new TestType("Hello", "my", "small", "lovely", "kitty");
//        TestType arr2 = new TestType(1,2,3,4,5);
//        arr1.reformat();
//        arr1.swapElements(3, 4);
//        arr2.swapElements(1,2);
//        System.out.println();
//        arr1.showArr();
//        arr2.showArr();

        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple = new Box(apple);
        Box<Apple> boxApple2 = new Box(apple);
        Box<Orange> boxOrange = new Box(orange);
        int i=1;
        while (i<=6){
            boxApple.addBox(apple);
            i++;}
        int j=1;
        while (j<=3){
            boxOrange.addBox(orange);
            j++;}
        System.out.println(boxApple.getWeight());
        System.out.println(boxOrange.getWeight());
        System.out.println(boxApple.compare(boxOrange));
        boxApple.moving(boxApple2);
        System.out.println(boxApple2.getWeight());


    }

}
