/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 64
 */
public class BuilderSnapshotDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Java");
        String snapshot = builder.toString();
        builder.append('!');
        System.out.println(snapshot);
        System.out.println(builder);
    }
}
