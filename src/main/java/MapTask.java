import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
    public static List<Integer> mappping(List<String> arr){
        //filter
        return arr.stream()
                .filter(value -> value.matches("[0-9]+") )// "\\d+"
                .map(Integer::parseInt).collect(Collectors.toList());
    }

}
