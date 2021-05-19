package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer arr1[] = {1, 2, 3, 4, 5, 6};
        String arr2[] = {"A", "B", "C"} ;
        swap(arr1,2,5);
        swap(arr2,1,2);

        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);


        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        System.out.println("Метод3 результат");
        System.out.println(" - addFruit: ");
        or.addFruit(new Orange(),8);
        or1.addFruit(new Orange(),10);
        ap.addFruit(new Apple(),9);
        ap1.addFruit(new Apple(),2);
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());
        System.out.println("'e' - round(): ");
        System.out.println("Box 1 equals box 3: "+or.round(ap));
        System.out.println("Box 2 equals box 4: "+or1.round(ap1));
        System.out.println("'f' - forit(): ");
        or.forit(or1);
        ap.forit(ap1);
        System.out.println("'d' - getWeight(): ");
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());


    }
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Метод1: "+ Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("The result of the replacement: "+Arrays.toString(arr));
    }
    public static <T> void asList(T[]arr){

        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Метод2 and the result of the conversion : "+alt);
    }
}
//Все равно поймал Exeption.....


//1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
//        2. Написать метод, который преобразует массив в ArrayList;
//        3. Большая задача:
//        a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
//        b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//        c. Для хранения фруктов внутри коробки можете использовать ArrayList;
//        d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
//        e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
//        g. Не забываем про метод добавления фрукта в коробку.