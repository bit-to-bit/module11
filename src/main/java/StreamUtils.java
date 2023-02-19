import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUtils {

    // Task 1-1: return only odd position names
    public static String getOddPositionNames1 (List<String> names) {

        List<String> oddNames = new ArrayList<>();

        for (int i = 1; i < names.size(); i += 2) {
            oddNames.add(i + "." + names.get(i));
        }

        return oddNames
                .stream()
                .collect(Collectors.toList())
                .toString().replaceAll("(\\[)|(\\])","");
    }

    // Task 1-2: return only odd position names
    public static String getOddPositionNames2 (List<String> names) {
        AtomicInteger i =  new AtomicInteger();
        return names.stream()
                .map(x -> {
                    int n = i.getAndIncrement();
                    return  n%2 == 1 ? n + "." + x.toString(): null;})
                .filter(Objects::nonNull)
                .collect(Collectors.toList())
                .toString()
                .replaceAll("(\\[)|(\\])","");
    }

    // Task 1-3: return only odd position names
    public static String getOddPositionNames3 (List<String> names) {

        Stream<Integer> counter = Stream.iterate(0, x -> x+1).limit(names.size());
        Iterator<String> namesIterator =  names.stream().iterator();

        return counter
                .map(i -> i % 2 == 1 ? i + "." + namesIterator.next(): namesIterator.next().substring(0,0))
                .filter(name -> !name.equals(""))
                .collect(Collectors.toList())
                .toString()
                .replaceAll("(\\[)|(\\])","");
    }

    // Task 2: sort names in uppercase
    public static List<String> sortNames(List<String> names) {
        return names
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    // Task 3: cast array to sort numbers string
    public static String arrayStringToSortNumbers(String[] arrayOfNumbers) {
        Stream<String> resultStream = Arrays.stream(arrayOfNumbers);
        return resultStream
                .map(s -> s.split(", "))
                .flatMap(Arrays::stream)
                .sorted()
                .collect(Collectors.toList())
                .toString()
                .replaceAll("(\\[)|(])","");
    }

    // Task 4: linear congruence generator
    public static Stream<Long> linearCongruenceGenerator(Long a, Long c, Long m) {
        return Stream.iterate(0L, x -> (a * x + c) % m);
    }

    // Task 5-1: stream mixer: variant 1
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

        List<T> result = new ArrayList<>();
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            result.add(firstIterator.next());
            result.add(secondIterator.next());
        }
        return result.stream();
    }

    // Task 5-2: stream mixer: : variant 2
    public static <T> Stream<T> zip2(Stream<T> first, Stream<T> second) {

        Iterator<T> secondIterator = second.iterator();
        return first.flatMap(firstValue -> secondIterator.hasNext()?Stream.of(firstValue, secondIterator.next()):Stream.empty());

    }
}
