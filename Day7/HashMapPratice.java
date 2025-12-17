package Day7;

import java.util.HashMap;

public class HashMapPratice {
    public static void main(String[] args){
        HashMap<Integer, String> days = new HashMap<>();
        days.put(0,"Sunday");
        days.put(1,"Monday");
        days.put(2,"Tuesday");
        days.put(3,"Wednesday");
        days.put(4,"Thursday");
        days.put(5,"Friday");
        days.put(6,"Saturday");

        System.out.println(days.get(0));

        System.out.println("No of days: " + days.size());

        System.out.print("Keys: ");
        for (int key: days.keySet()){
            System.out.print(key + " ");
        }
        System.out.println();
        System.out.print("Values: ");
        for (String value: days.values()){
            System.out.print(value + " ");
        }
    }
}
