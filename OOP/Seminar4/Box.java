package OOP.Seminar4;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T fruit) {
        list.add(fruit);
    }

    public int getWeight() {
        int sum = 0;

        for (T obj : list) {
            sum += obj.getWeight();
        }
        return sum;
    }

    public int size() {
        return list.size();
    }

    public T get(int index) {
        return list.get(index);
    }

    public void moveTo(Box<? super T> list1) {
        for (T item : list) {
            list1.add(item);
        }
    }
}
