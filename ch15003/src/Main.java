import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

       Counter counter=new Counter();

        ExecutorService executorService= Executors.newFixedThreadPool(3);

        Runnable runnable=()->{
            for (int i=0;i<1000;i++)
            {
                counter.increment();;
            }
        };

        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);

        executorService.shutdown();
        while (!executorService.isTerminated()) {
            // Havuzdaki tüm görevlerin tamamlanmasını bekleyin.
        }
        System.out.println("Counter: "+ counter.getCount());
    }
}