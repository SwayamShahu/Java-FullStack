package SelfStudy;

public class EnemPractice {
    public static void main(String args[]) {

        // Enum

        enum status{
            pending(0),complete(1),requested(-1);

            int value;
            status(int value){
                this.value = value;
            }
        }

    }
}
