public class LamdaExpression {
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> System.out.println("running"));
        t1.start();

    }
}


class Task implements Runnable{

    @Override
    public void run() {
        System.out.println("Running");
    }

}
