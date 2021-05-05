package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;

import static com.sun.deploy.net.UpdateTracker.clear;

public class Box<T extends Fruit> {
    private List<T> box;

    Box(T... fruit) {
        this.box = new ArrayList<T>();
    }

    public void addBox(T fruit) {
        box.add(fruit);
    }

    public float getWeight() {
        if (box.size() != 0) {
           return box.size() * this.box.get(0).getWeigh();
        } else return (0);
    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }

    private void put(List<T> fruits) {
        this.box.addAll(fruits);;
    }

    public void moving(Box<T> box2) {

        System.out.println(box);
        box2.put(box);
        box.clear();
        System.out.println(box);
        System.out.println(box2);
    }
}


