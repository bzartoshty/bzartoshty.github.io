/**
 * COMP 182 - Hashing
 * Slides 21 and 22: linear probing practice and answer.
 * Uses capacity 11 and records every probe, including the final slot.
 */
public class ProbingPractice {
    public static void main(String[] args) {
        // Linear probing: probe(key, i) = ((key mod 11) + i) mod 11.
        ProbeTable table = new ProbeTable(11, ProbeTable.Mode.LINEAR, 7);
        System.out.println("LINEAR");
        for (int key : new int[]{44, 4, 16, 28, 21, 26}) {
            ProbeTable.Result result = table.insert(key);
            System.out.println(key + ": " + result.probes() + " -> " + result.index());
        }
        System.out.println(table.slots());
    }
}
