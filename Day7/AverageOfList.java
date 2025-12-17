package Day7;

import java.util.ArrayList;

public class AverageOfList {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        float sum = 0;
        for (Integer i: list){
            sum = sum + (float) i.intValue();
        }
        System.out.println("Average: " + (sum/list.size()));
    }
}
