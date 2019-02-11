package gradle.build;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingDuplicatesStream {
    static Map<Character, Long> duplicateMap = new HashMap<>();
    public static int duplicateCount(String text){
        duplicateMap = Arrays.stream(text.toUpperCase().split("")).collect(Collectors.groupingBy(chars -> chars.charAt(0), Collectors.counting()));
        return (int)duplicateMap.entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue()>1).count();
    }
}
