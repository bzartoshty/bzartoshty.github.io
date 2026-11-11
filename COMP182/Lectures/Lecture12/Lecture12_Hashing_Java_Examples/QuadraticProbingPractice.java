/**
 * COMP 182 - Hashing
 * Quadratic probing for the six-key practice answer on slide 27.
 * Compile with ProbeTable.java using Java 17 or newer.
 */
public class QuadraticProbingPractice {
    public static void main(String[] args) {
        // probe(key, i) = ((key mod 11) + i * i) mod 11, starting at i = 0.
        ProbeTable table = new ProbeTable(11, ProbeTable.Mode.QUADRATIC, 7);
        System.out.println("QUADRATIC");
        for (int key : new int[]{44, 4, 16, 28, 21, 26}) {
            ProbeTable.Result result = table.insert(key);
            System.out.println(key + ": " + result.probes() + " -> " + result.index());
        }
        System.out.println(table.slots());
    }
}
