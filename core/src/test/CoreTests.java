package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.*;

import static org.junit.Assert.*;

public class CoreTests {

    @Test
    public void absoluteOfMostNegativeValue() {
        final int mostNegative = Integer.MIN_VALUE;
        final int negated = Math.abs(mostNegative);
        assertFalse("No positive equivalent of Integer.MIN_VALUE", negated > 0);
    }

    @Test(expected = NullPointerException.class)
    public void expectNullPointerExceptionToBeThrown() {
        final String s = null;
        final int stringLength = s.length();
    }

    @Test
    public void demonstrateResourceHandling() {
        try(final FileReader reader = new FileReader("/tmp/dataFile")) {
            final char[] buffer = new char[128];
            reader.read(buffer);
        } catch (IOException e) {
// .. deal with exception
        }
    }

    @Test(expected = Exception.class)
    public void runTest() throws IOException {
        final Path fileSystemFile = Paths.get("/tmp/existent-file.txt");
// incorrect usage of Paths.get
        final Path wrongFile = Paths.get("http://example.com/wrong-file");
        final long fileSize = Files.size(fileSystemFile);
        final long networkFileSize = Files.size(wrongFile);
        assertEquals(fileSize, networkFileSize);
    }

    @Test
    public void executorExample() {
        final ExecutorService executor = Executors.newCachedThreadPool();
        final Runnable threadNamePrinter = new InfiniteThreadNamePrinter();
        System.out.println("Main thread: " +
                Thread.currentThread().getName());
        executor.execute(threadNamePrinter);
    }
    private static class InfiniteThreadNamePrinter implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("Run from thread: " +
                        Thread.currentThread().getName());
            }
        }
    }

    @Test
    public void waitToComplete() throws InterruptedException {
        final ExecutorService executor = Executors.newCachedThreadPool();
        final CountDownLatch latch = new CountDownLatch(1);
        executor.execute(new FiniteThreadNamePrinterLatch(latch));
        latch.await(5, TimeUnit.SECONDS);
    }
    private static class FiniteThreadNamePrinterLatch implements Runnable {
        final CountDownLatch latch;
        private FiniteThreadNamePrinterLatch(final CountDownLatch latch) {
            this.latch = latch;
        }
        @Override
        public void run() {
            for (int i = 0; i < 25; i++) {
                System.out.println("Run from thread: " +
                        Thread.currentThread().getName());
            }
            latch.countDown();
        }
    }

    @Test
    public void sameThread() {
        final Executor executor = command -> command.run();
        System.out.println("Main thread: " +
                Thread.currentThread().getName());
        executor.execute(new FiniteThreadNamePrinter());
    }
    private static class FiniteThreadNamePrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 25; i++) {
                System.out.println("Run from thread: " +
                        Thread.currentThread().getName());
            }
        }
    }
}
