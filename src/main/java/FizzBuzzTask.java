import java.util.stream.IntStream;

public class FizzBuzzTask {

    public static void fizzBuzzIt(int lowerB, int upperB) {

        IntStream
                .rangeClosed(lowerB, upperB)
                .mapToObj(
                        i -> i % 3 == 0 ?
                                (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
                                (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
