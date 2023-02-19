import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestStreamUtils {
    public static void main(String[] args) {

        // Task 1-1: test getOddPositionNames()
        List namesTest0 = new ArrayList<>();
        List namesTest1 = new ArrayList<>(List.of("Petro","Slava","Katty","Bill","Sam","Jon","Bruce","Oleg"));

        System.out.println("\nTask 1-1: test getOddPositionNames():\n->");
        System.out.println("StreamUtils.getOddPositionNames1(namesTest0) = " + StreamUtils.getOddPositionNames1(namesTest0));
        System.out.println("StreamUtils.getOddPositionNames1(namesTest1) = " + StreamUtils.getOddPositionNames1(namesTest1));

        // Task 1-2: test getOddPositionNames2()
        System.out.println("\nTask 1-2: test getOddPositionNames2():\n->");
        System.out.println("StreamUtils.getOddPositionNames2(namesTest0) = " + StreamUtils.getOddPositionNames2(namesTest0));
        System.out.println("StreamUtils.getOddPositionNames2(namesTest1) = " + StreamUtils.getOddPositionNames2(namesTest1));

        // Task 1-3: test getOddPositionNames2()
        System.out.println("\nTask 1-3: test getOddPositionNames3():\n->");
        System.out.println("StreamUtils.getOddPositionNames3(namesTest0) = " + StreamUtils.getOddPositionNames3(namesTest0));
        System.out.println("StreamUtils.getOddPositionNames3(namesTest1) = " + StreamUtils.getOddPositionNames3(namesTest1));

        // Task 2: test sortNames()
        System.out.println("\nTask 2: test sortNames():\n->");
        System.out.println("StreamUtils.sortNames(namesTest0) = " + StreamUtils.sortNames(namesTest1));

        // Task 3: test arrayStringToSortNumbers()
        System.out.println("\nTask 3: test arrayStringToSortNumbers():\n->");
        String[] numbersTest2 = {"1, 2, 0", "4, 5"};
        System.out.println("StreamUtils.arrayStringToSortNumbers(numbersTest2) = " + StreamUtils.arrayStringToSortNumbers(numbersTest2));

        // Task 4: linear congruence generator
        System.out.println("\nTask 4: test linearCongruenceGenerator():\n->");
        System.out.println("StreamUtils.linearCongruenceGenerator(6L, 2L, 77777777777L) = " + StreamUtils.linearCongruenceGenerator(6L, 2L, 77777777777L).limit(10).collect(Collectors.toList()));
        System.out.println("StreamUtils.linearCongruenceGenerator(1L, 1L, -9L) = " + StreamUtils.linearCongruenceGenerator(1L, 1L, -9L).limit(1000).collect(Collectors.toList()));
        System.out.println("StreamUtils.linearCongruenceGenerator(25214903917, 11, 2^48) = " + StreamUtils.linearCongruenceGenerator(25214903917l, 11l, 2 ^ 48l).limit(1000).collect(Collectors.toList()));


        // Task 5-1: stream mixer
        System.out.println("\nTask 5-1: test zip(): \n->");

        Stream<String> streamX1 = Stream.of("!", "@", "#", "$", "%", "^", "&");
        Stream<String> streamX2 = Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11");
        System.out.println("StreamUtils.zip(streamX1,streamX2) = " + StreamUtils.zip(streamX1, streamX2).collect(Collectors.toList()));


        Stream<Integer> streamY1 = Stream.of(90,80,70,60,50,40,30,20,10,0,-10,-20,-30);
        Stream<Integer> streamY2 = Stream.of(1,2,3,4,5,6,7,8,9);
        System.out.println("StreamUtils.zip(streamY1,streamY2) = " + StreamUtils.zip(streamY1, streamY2).collect(Collectors.toList()));

        // Task 5-2: stream mixer
        System.out.println("\nTask 5-2: test zip2(): \n->");

        Stream<String> streamZ1 = Stream.of("!", "@", "#", "$", "%", "^", "&");
        Stream<String> streamZ2 = Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11");
        System.out.println("StreamUtils.zip2(streamZ1,streamZ2) = " + StreamUtils.zip2(streamZ1, streamZ2).collect(Collectors.toList()));

        Stream<Integer> streamR2 = Stream.of(1,2,3,4,5,6,7,8,9);
        Stream<Integer> streamR1 = Stream.of(90,80,70,60,50,40,30,20,10,0,-10,-20,-30);
        System.out.println("StreamUtils.zip2(streamR1,streamR2) = " + StreamUtils.zip2(streamR1, streamR2).collect(Collectors.toList()));

    }

}
