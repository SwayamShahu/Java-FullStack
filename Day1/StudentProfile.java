class Student{
    String name;
    String rollNo;
    String branch;
    int age;
    // int marks;
    private int marks;

    public void setMarks(int mark){
        if(mark >= 0 && mark <= 100){
            System.out.println("Valid Marks");
            marks = mark;
        }else{
            System.out.println("Invalid Marks");
        }
    }

    public int getMarks(){
        return marks;
    }

    Student(String name, String rollNo, String branch, int age, int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.age = age;
        setMarks(marks);
        // this.marks = marks;
    }

    void intoduction(){
        System.out.println("Hi, My name is " + name + " and my age is " + age + ". Currently I am student of " + branch + " branch with roll number " + rollNo);
    }

    void isPassed(){
        if (marks >= 35) {
            System.out.println("Succesfully Passed !!!!");
        }else{
            System.out.println("Fail !!!");
        }
    }
}
public class StudentProfile{
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.name = "Swayam";
        // s1.age = 21;
        // s1.branch = "Computer Science";
        // s1.rollNo = "CS22051";
        // s1.intoduction();

        // Student s2 = new Student();
        // s2.name = "Dishant";
        // s2.age = 21;
        // s2.branch = "Computer Science";
        // s2.rollNo = "CS22050";
        // s2.intoduction();

        Student s1 = new Student("Swayam", "CS22051", "Computer Science", 21,86);
        s1.intoduction();
        s1.isPassed();

        Student s2 = new Student("Roshan", "CS22035", "Data Science", 18, 22);
        s2.intoduction();
        s2.isPassed();
    }
}
