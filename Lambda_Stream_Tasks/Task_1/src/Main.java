import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("a1", "c2", "a2", "b1", "c1"));
        ArrayList<String> myList2 = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));

        BiFunction<ArrayList<String>, ArrayList<String>, ArrayList<String>> func =
                (list1, list2) -> new ArrayList<>(Stream
                        .concat(list1.stream(), list2.stream())
                        .sorted()
                        .collect(Collectors.toList()));

        ArrayList<String> result = func.apply(myList, myList2);
        System.out.println(result);
    }
}
