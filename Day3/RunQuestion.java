import java.util.Arrays;

public class RunQuestion {
    static void main(String[] args) {
        Questions obj = new Questions();

//        obj.studentsMarks();

//        obj.week();
//        obj.countAllDigits();
//        obj.reverseNumber();

//        obj.palindrome();

//        obj.primeNumber();
        int[] arr = obj.arrayReverse();
        System.out.println(Arrays.toString(arr));
    }
}
