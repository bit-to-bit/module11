import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddPositionNames {

    public static String getOddPositionNames (List names) {

        List oddNames = new ArrayList();

        for (int i = 1; i < names.size(); i += 2) {
            oddNames.add(i + "." + names.get(i));
        }

        return oddNames.stream().collect(Collectors.toList()).toString().replaceAll("(\\[)|(\\])","");
    }

}
