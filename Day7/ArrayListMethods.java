package Day7;

import java.util.*;

public class ArrayListMethods {
    static void main(String[] args) {
        /* Features
            1. Indexed Allowed
            2. Allow Duplicate
            3. Insertion Order - stored in order of insertion
            4. Not Synchronized: Not thread Safe

            Methods -
            1. add()
            2. remove()
            3. isEmpty()
            4. contains()
            5. indexOf(3)
            6. set(index, value)
            7. toArray() -> return object array
         */

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.remove(3);
//        list.add(5);
//
//        System.out.println(list);
//
//        list.add(3,4);
//
//        System.out.println(list);
//
//        System.out.println(list.indexOf(3));
//
//        System.out.println(list.contains(5));
//
//        list.set(0,9);
//        System.out.println(list);
//
//        Objects[] arr = list.toArray();


        // Create a array list and add 5 integer. Print the list
        ArrayList<Integer> list = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        System.out.println(list);

        // Add Element a specific index
        list.add(5,5);
        System.out.println(list);

        // Find the size of arraylist
        System.out.println("Size: " + list.size());

        // Access first and last element
        System.out.println("First Element: " + list.get(0));
        System.out.println("Last Element: " + list.get(list.size()-1));

        // Remove element from the index
        System.out.println("Removing element: " + list.remove(5));

        // Check if the element exist in the list
        System.out.println("Element exist: " + list.contains(3));

        // Clear all element of the list
        list.clear();
        System.out.println("Clearing array: " + list);

        list.add(1);
        list.add(2);

        // Copy element to other list
        ArrayList<Integer> list1 = new ArrayList<>(list);
        System.out.println("New array" + list1);

//        Traversing the list

        for(Integer element: list){
            System.out.println(element);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        Collections.reverse(list);
        System.out.println(list);
        System.out.println(list.reversed());




    }
}
