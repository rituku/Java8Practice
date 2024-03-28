import java.util.concurrent.*;
import java.util.function.Supplier;

public class ComplFuture {

    public static void main(String[] args) {
        CompletableFuture<Void> cf = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                System.out.println("test");
            }
        });

        try {
            cf.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        ExecutorService exsr = Executors.newFixedThreadPool(4);
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
                return "Completable future supply async";
            }
        }, exsr);
        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(()-> {return "test";})
                .thenApply((name) -> {return name+"ritu"; })
                .thenApply((name1) -> {return name1+"rani";});
        try {
            System.out.println(completableFuture1.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
