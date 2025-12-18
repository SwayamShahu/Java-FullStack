package Day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Questions {

    static void countVowel(String str){
        str = str.toLowerCase();
        int i = 0;
        HashMap<Character, Integer> vowelCount = new HashMap<>();
        while(i < str.length()){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                vowelCount.put(str.charAt(i), vowelCount.getOrDefault(str.charAt(i), 0) + 1);
            }
            i++;
        }
        System.out.println(vowelCount);
    }
    static void removeDuplicate(String str){
        String newString = "";
        String[] strArray = str.split(" ");
        HashSet<String> hs = new HashSet<>();
        for(String s: strArray){
            if (!hs.add(s)){
                newString =  newString + " " + s;
            }
        }
        System.out.println(newString);
    }

    static void removeDuplicateUsingHashMap(String str){
        String[] strArray = str.split(" ");

        HashMap<String,Integer> hm = new HashMap<>();
        String duplicate = "";

        for (String s: strArray){

            if (hm.get(s) == null){
                hm.put(s,1);
                duplicate = duplicate + " " + s;
            }else{
                int count = hm.get(s);
                if (count == 1) duplicate += " " + s;
                hm.put(s, count + 1);
            }
        }
        System.out.println(duplicate);

    }

    static void moveNoZeroToLastUsingNewList(ArrayList<Integer> list){
        int i = 0;
        int current = 0;

        ArrayList<Integer> newList = new ArrayList<>(list.size());

        while(i < list.size()){
            if (list.get(i) != 0){
                newList.add(current, list.get(i));
                current ++;
            }
            i++;
        }
        while (current < list.size()){
            newList.add(0);
            current++;
        }
        System.out.println(newList);
    }

    static void moveNoZeroToLast(ArrayList<Integer> list){
        int i = 0;
        int j = list.size() - 1;

        while (i < j) {

            while (i < j && list.get(i) != 0) {
                i++;
            }

            while (i < j && list.get(j) == 0) {
                j--;
            }

            if (i < j) {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        System.out.println(list);
    }
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(0);
//        list.add(0);
//        list.add(43);
//        list.add(4);
//        list.add(-1);
//        list.add(4);
//        list.add(5);
//        list.add(67);
//        list.add(0);
//        list.add(5);

//        moveNoZeroToLast(list);
//        moveNoZeroToLastUsingNewList(list);

        // Given a sentence remove duplicate words
        String str = "java is easy , java is platform independent and java is powerful";
//        removeDuplicate(str);
//        removeDuplicateUsingHashMap(str);
        countVowel(str);
    }

}
