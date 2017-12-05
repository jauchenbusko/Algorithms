package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
}
