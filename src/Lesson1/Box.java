package Lesson1;

import java.util.ArrayList;

public class Box<T extends Fruits> {
    private ArrayList<T> box = new ArrayList<>();
    public Box() {

    }
    public float getWeight(){
    float weight = 0.0f;
//        for (int i =0; i < box.lastIndexOf(box); i++);
        for (T p : box);{
            Box<Fruits> p = null;
            weight += p.getWeight();
        }return weight;
    }
   public boolean round(Box anotherBox){
        if (getWeight() == anotherBox.getWeight()) return true;
        return false;
   }

   public void forit(Box <T>anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
   }


    public void addFruit(T orange, int i) {

    }
}
