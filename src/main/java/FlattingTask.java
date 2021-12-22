import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlattingTask {
    public static List<String> flattingString(List<String> arr){
        return arr.stream()
                .flatMap(value -> Arrays.stream(value.split("")))//Stream.of
                //.flatMap(value -> Arrays.asList(value).stream())
                .collect(Collectors.toList());
    }
}
