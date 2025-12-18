package SelfStudy;
interface ABC{
    void display();
}
public class FunctionInterface {
    public static void main(String[] args){

        // Anoynomous Class
        /*
        ABC obj = new ABC(){
            public void display(){
                System.out.println("Hello");
            }
        };
        obj.display();
         */

        ABC obj = () -> System.out.println("Hello");

        obj.display();
    }
}
