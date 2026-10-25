/**
 * COMP 182 - Hashing
 * Slides 21, 22, 23, 24
 * Starts a fresh table for each method; matches every probe in the six-key exercise.
 */
public class ProbingPractice {
    public static void main(String[] args) {
        for(ProbeTable.Mode mode:new ProbeTable.Mode[]{ProbeTable.Mode.LINEAR,
                ProbeTable.Mode.QUADRATIC,ProbeTable.Mode.DOUBLE_PRIME}){
            ProbeTable table=new ProbeTable(11,mode,7);
            System.out.println(mode);
            for(int key:new int[]{44,4,16,28,21,26}){
                ProbeTable.Result r=table.insert(key);
                System.out.println(key+": "+r.probes()+" -> "+r.index());
            }
            System.out.println(table.slots());
        }
    }
}
