/**
 * COMP 182 - Hashing
 * Slides 17, 18, 19
 * Reproduces the five-key trace, wraparound, primary clustering, and tombstone lookup.
 */
public class LinearProbingDemo {
    public static void main(String[] args) {
        ProbeTable table=new ProbeTable(10,ProbeTable.Mode.LINEAR,0);
        for(int key:new int[]{38,19,8,79,10}){
            ProbeTable.Result r=table.insert(key);
            System.out.println(key+": "+r.probes()+" -> "+r.index());
        }
        System.out.println(table.slots());
        System.out.println("18 probes: "+table.insert(18).probes());
        table.remove(38);
        System.out.println("8 survives deletion: "+table.contains(8));
        System.out.println("duplicate 8 inserted: "+table.insert(8).inserted());
    }
}
