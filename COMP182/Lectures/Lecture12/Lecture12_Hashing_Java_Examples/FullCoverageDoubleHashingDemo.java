/**
 * COMP 182 - Hashing
 * Slide 31: A full-coverage double-hashing scheme.
 * Compile with ProbeTable.java using Java 17 or newer.
 */
public class FullCoverageDoubleHashingDemo {
    public static void main(String[] args) {
        final int p = 11; // Prime table capacity.
        final int q = 7;  // Smaller prime used for the second hash.
        ProbeTable table = new ProbeTable(p, ProbeTable.Mode.DOUBLE_PRIME, q);

        // h1(key) = Math.floorMod(key, p)
        // h2(key) = q - Math.floorMod(key, q)
        // probe(key, i) = (h1(key) + i * h2(key)) mod p, starting at i = 0.
        // Because 1 <= h2(key) <= q < p and p is prime, each sequence
        // visits every slot before repeating. ProbeTable bounds attempts by p.
        System.out.println("FULL-COVERAGE DOUBLE HASHING: p = " + p + ", q = " + q);
        System.out.println("h1(key) = floorMod(key, p)");
        System.out.println("h2(key) = q - floorMod(key, q)");
        for (int key : new int[]{44, 4, 16, 28, 21, 26}) {
            ProbeTable.Result result = table.insert(key);
            System.out.println(key + ": home " + table.home(key)
                    + ", step " + table.step(key) + ", probes " + result.probes()
                    + " -> " + result.index());
        }
        System.out.println("Final slots: " + table.slots());
    }
}
