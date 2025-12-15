package Day4;

public class QuestionMain {
    static void main(String[] args) {
//        Question q = new Question();
//        q.removeLeadingZero();
        try{
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }
}
