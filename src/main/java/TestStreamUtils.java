import java.util.ArrayList;
import java.util.List;

public class TestStreamUtils {
    public static void main(String[] args) {

        // Test OddPositionNames()
        List namesTest0 = new ArrayList<>();
        List namesTest1 = new ArrayList<>(List.of("Petro","Ivan","Katty","Bill","Sam","Jon","Bruce","Oleg"));
        System.out.println("OddPositionNames.getOddPositionNames(namesTest0) = " + StreamUtils.getOddPositionNames(namesTest0));
        System.out.println("OddPositionNames.getOddPositionNames(namesTest1) = " + StreamUtils.getOddPositionNames(namesTest1));


    }


}
