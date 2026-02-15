class MultiTasks extends Thread {
    private String task;

    MultiTasks(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " is being done by " + Thread.currentThread().getName());
    }
}

public class CustomThread {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        Thread t1 = new MultiTasks("Task 1");
        Thread t2 = new MultiTasks("Task 2");
        Thread t3 = new MultiTasks("Task 3");

        t1.start();
        t2.start();
        t3.start();
    }
}