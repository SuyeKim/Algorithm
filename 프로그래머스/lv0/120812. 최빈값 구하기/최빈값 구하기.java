import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] array) {
        Map<Integer, Long> counts = Arrays.stream(array)
            .boxed()
            .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        Optional<Map.Entry<Integer, Long>> mode = counts.entrySet()
            .stream()
            .max(Map.Entry.comparingByValue());

        if (mode.isPresent() && counts.values().stream().filter(v -> v.equals(mode.get().getValue())).count() == 1) {
            return mode.get().getKey();
        } else {
            return -1;
        }
    }
}