package Day7;

import java.util.ArrayList;

public class FrequencyOfElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            count.add(0);
        }

        for (int i = 0; i < 100; i++) {
            list.add((int)(Math.random() * 100) + 1);
        }

        for (int i = 0; i < 100; i++) {
            int index = list.get(i) - 1;
            count.set(index, count.get(index) + 1);
        }

        for (int i = 0; i < 100; i++) {
            if (count.get(i) > 0) {
                System.out.println((i + 1) + " occurs " + count.get(i) + " times");
            }
        }
    }
}
