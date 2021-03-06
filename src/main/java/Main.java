
import java.security.KeyStore;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toMap;

public class Main {
    public static Map.Entry<String,String> tranform(Map.Entry<Character, List<String>> el){
        return new AbstractMap
                .SimpleEntry<>(
                        String.valueOf(el.getKey()),
                el.getValue().stream().collect(joining()));
    }
    public static void main(String[] args){
        //Human student = new Student();
   /* Human student = new Human() {
        @Override
        public void process() {

        }
    };

    Human student2 = () -> System.out.println();

    List<String> arr = Arrays.asList("1","2","3");*/

        //System.out.println(FlattingTask.flattingString(Arrays.asList("abc","dvc")));
        //FizzBuzzTask.fizzBuzzIt(0,50);

    System.out.println(KeyCounter(Arrays.asList("abc", "dvc", "bdc", "abc")));
    }

    //task 4
    public static Map<String,Long> KeyCounter(List<String> arr){
        return arr
                .stream()
                .collect(groupingBy(value -> value.charAt(0), HashMap::new, toList()))
                .entrySet()
                .stream()
                .map(Main::tranform)
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue))
                .entrySet()
                .stream()
                .collect(toMap(Map.Entry::getKey,
                        c -> c.getValue().chars().filter(ch -> ch == c.getKey().charAt(0)).count()));
    }
}
