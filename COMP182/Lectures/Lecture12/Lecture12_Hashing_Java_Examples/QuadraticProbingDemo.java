/**
 * COMP 182 - Hashing
 * Slides 25, 26, 27
 * Square offset is measured from home each time. Failure does not imply the whole array is full.
 */
public class QuadraticProbingDemo {
    public static void main(String[] args) {
        trace(10,new int[]{89,18,49,58,79});
        trace(7,new int[]{76,40,48,5,55,47});
    }
    private static void trace(int capacity,int[] keys) {
        ProbeTable table=new ProbeTable(capacity,ProbeTable.Mode.QUADRATIC,0);
        System.out.println("Capacity "+capacity);
        for(int key:keys){
            ProbeTable.Result r=table.insert(key);
            System.out.println(key+": "+r.probes()+" -> "+r.index());
        }
        System.out.println(table.slots());
    }
}
