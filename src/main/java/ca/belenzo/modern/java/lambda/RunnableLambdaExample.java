package ca.belenzo.modern.java.lambda;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        // Prior to Java 8
        Runnable runnable1 = new Runnable() {
            public void run() {
                System.out.println("Inside run() method of runnable1");
                System.out.println(" ");
            }
        };
        new Thread(runnable1).start();

        // Lambda () -> {}
        Runnable lambdaRunnable2 = () -> {
            System.out.println("Inside run() method of lambdaRunnable2");
            System.out.println(" ");
        };
        new Thread(lambdaRunnable2).start();

        Runnable simpleLambdaRunnable3 = () -> System.out.println("Inside run() method of simpleLambdaRunnable3");
        new Thread(simpleLambdaRunnable3).start();

        // Prior to Java 8
        new Thread(new Runnable() {
            public void run() {
                System.out.println(" ");
                System.out.println("Inside run() method of anonymousRunnable4");
                System.out.println(" ");
            }
        }).start();

        new Thread(() -> System.out.println("Inside run() method of anonymousLambdaRunnable5")).start();

    }

}
