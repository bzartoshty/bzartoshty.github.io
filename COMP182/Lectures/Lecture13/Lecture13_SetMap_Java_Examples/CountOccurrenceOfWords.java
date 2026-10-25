import java.util.*;
import java.nio.file.*;
import java.io.IOException;
public class CountOccurrenceOfWords {
    public static Map<String,Integer> count(String text) {
        Map<String,Integer> counts = new HashMap<>();
        for (String word : text.toLowerCase(Locale.ROOT).split("[^\\p{L}\\p{N}]+")) {
            if (!word.isEmpty()) counts.merge(word,1,Integer::sum);
        }
        return new TreeMap<>(counts);
    }
    public static void main(String[] args) throws IOException {
        String text = args.length == 0 ? "Java, java! Maps help; maps count."
            : Files.readString(Path.of(args[0]));
        System.out.println(count(text));
    }
}
