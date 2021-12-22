import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MapTaskTest {

    @org.junit.jupiter.api.Test
    void mappping() {
        assertEquals(Arrays.asList(6,4,1),MapTask.mappping(Arrays.asList("abc","dvc","6","4","1")));
    }
}