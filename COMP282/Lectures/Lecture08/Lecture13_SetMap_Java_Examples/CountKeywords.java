import java.util.*;
import java.nio.file.*;
import java.io.IOException;
/** Teaching scanner for ordinary Java source; rejects Unicode escape translation. */
public class CountKeywords {
    private static final Set<String> KEYWORDS = Set.of((
        "abstract assert boolean break byte case catch char class const continue " +
        "default do double else enum extends final finally float for goto if " +
        "implements import instanceof int interface long native new package private " +
        "protected public return short static strictfp super switch synchronized " +
        "this throw throws transient try void volatile while _").split(" "));
    public static Map<String,Integer> count(String source) {
        if (source.contains("\\u"))
            throw new IllegalArgumentException("Unicode escapes require a full Java lexer");
        Map<String,Integer> result = new TreeMap<>(); int i = 0, n = source.length();
        while (i < n) {
            if (source.startsWith("//",i)) {
                i += 2; while (i < n && source.charAt(i) != '\n' && source.charAt(i) != '\r') i++;
            } else if (source.startsWith("/*",i)) {
                int end = source.indexOf("*/",i+2); i = end < 0 ? n : end+2;
            } else if (source.startsWith("\"\"\"",i)) {
                i += 3;
                while (i < n && !source.startsWith("\"\"\"",i)) {
                    if (source.charAt(i) == '\\') i = Math.min(n,i+2); else i++;
                }
                i = Math.min(n,i+3);
            } else if (source.charAt(i) == '"' || source.charAt(i) == '\'') {
                char quote = source.charAt(i++);
                while (i < n) {
                    char c = source.charAt(i++);
                    if (c == '\\' && i < n) i++;
                    else if (c == quote) break;
                }
            } else if (Character.isJavaIdentifierStart(source.codePointAt(i))) {
                int start = i; i += Character.charCount(source.codePointAt(i));
                while (i < n && Character.isJavaIdentifierPart(source.codePointAt(i)))
                    i += Character.charCount(source.codePointAt(i));
                String token = source.substring(start,i);
                if (KEYWORDS.contains(token)) result.merge(token,1,Integer::sum);
            } else i++;
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        String source = args.length == 0 ? "public class Demo { int n; // while\n String s = \"if\"; }"
            : Files.readString(Path.of(args[0]));
        Map<String,Integer> counts = count(source);
        System.out.println(counts);
        System.out.println("total: " + counts.values().stream().mapToInt(Integer::intValue).sum());
    }
}
