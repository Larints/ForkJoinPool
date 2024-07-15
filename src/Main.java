import java.util.concurrent.ForkJoinPool;

public class Main {


    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        long num = 4;
        long result = forkJoinPool.invoke(new FactorialTask(num));
        System.out.println("Факториал " + num + " равен " + result);
    }

}
