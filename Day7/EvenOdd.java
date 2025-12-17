package Day7;

import java.util.ArrayList;

public class EvenOdd {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        // Even and odd code
        for (Integer i: list){
            if (i.intValue() % 2 == 0){
                System.out.println("Even: " + i);
            }else{
                System.out.println("Odd: " + i);
            }
        }
    }
}
