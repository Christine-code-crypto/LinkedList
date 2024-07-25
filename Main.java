import java.util.LinkedList;
import java.util.Collections; //The collection class class has got the sort method

public class Main{
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>(); //specifies a linkedlist that will hold string objects and
        //creates an instance of linked list that will hold string objects since linked list is basically a class in java.

        //incase we say LinledList cars = new LinkedList(); it will work but we will lose type safety because the linked list will hold any type and this can lead to runtime errors if you try to retrieve an object and cast it to the wrong type
        cars.add("Volvo");
        cars.add("Benz");
        cars.add("Audi");
        cars.add("Honda");

        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars); //cars sorted in alphabetical order

        //using the for each loop to display the sorted cars
        for(String i: cars){ //for each element in cars...String i is not a counter...<<it means each element>>
            System.out.println(i);
        }

        //Sort an array of integers numerically in ascending order

        


    }
}