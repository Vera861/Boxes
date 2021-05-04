package ru.geekbrains;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box;

    public Box(T... fruit) {
        this.box = new ArrayList<T>();
    }

    public void addBox(T fruit) {
        box.add(fruit);
    }

    public float getWeight() {
        if (box.size() != 0) {
            float value = this.box.get(0).getWeigh();
            return box.size() * value;
        } else return (0);
    }

    public boolean compare(Box box) {

        if (this.getWeight() == box.getWeight())
            return true;
        else return false;
    }

    public void moving(Box<T> box2) {
        System.out.println(box);
        for (T fruit:box){
        box2.box.add(fruit);}
        box.clear();
        System.out.println(box);
        System.out.println(box2);
    }
}


