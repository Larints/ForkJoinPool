import java.util.concurrent.RecursiveTask;

public class FactorialTask extends RecursiveTask<Long> {

    private final long n;

    public FactorialTask(long n) {
        this.n = n;
    }

    @Override
    protected Long compute() {
        if (n <= 1) return 1L;
        else {
            FactorialTask subTask = new FactorialTask(n - 1);
            subTask.fork();
            return n * subTask.join();
        }
    }
}
