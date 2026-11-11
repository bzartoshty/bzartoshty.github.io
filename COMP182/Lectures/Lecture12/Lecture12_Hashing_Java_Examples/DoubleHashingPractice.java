/**
 * COMP 182 - Hashing
 * Double hashing for the six-key practice exercise.
 * Compile with ProbeTable.java using Java 17 or newer.
 */
public class DoubleHashingPractice {
    public static void main(String[] args) {
        // h1(key) = key mod 11; h2(key) = 7 - (key mod 7).
        // probe(key, i) = (h1(key) + i * h2(key)) mod 11, starting at i = 0.
        ProbeTable table = new ProbeTable(11, ProbeTable.Mode.DOUBLE_PRIME, 7);
        System.out.println("DOUBLE HASHING");
        for (int key : new int[]{44, 4, 16, 28, 21, 26}) {
            ProbeTable.Result result = table.insert(key);
            System.out.println(key + " step " + table.step(key) + ": "
                    + result.probes() + " -> " + result.index());
        }
        System.out.println(table.slots());
    }
}
