import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FlattingTaskTest {

    @Test
    void flattingString() {
        assertEquals( Arrays.asList("a","b","c","d","v","c"),FlattingTask.flattingString(Arrays.asList("abc","dvc")));
    }
}