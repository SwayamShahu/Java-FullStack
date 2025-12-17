package Day7;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequencyOfElementUsingHashMap {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int)(Math.random() * 100) + 1);
        }

        HashMap<Integer,Integer> hm = new HashMap<>();
        for (Integer value: list){
            hm.put(value, hm.getOrDefault(value,0)+1);
        }

        hm.forEach((k,v)-> System.out.println(k + " Iterates : " + v + " times")) ;
    }
}
