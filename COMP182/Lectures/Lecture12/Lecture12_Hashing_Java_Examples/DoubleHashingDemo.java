/**
 * COMP 182 - Hashing
 * Slides 28, 29, 30
 * Legacy configuration intentionally fails for key 43; the prime configuration guarantees full probe coverage.
 */
public class DoubleHashingDemo {
    public static void main(String[] args) {
        ProbeTable legacy=new ProbeTable(10,ProbeTable.Mode.DOUBLE_LEGACY,0);
        for(int key:new int[]{13,28,33,147,43}){
            ProbeTable.Result r=legacy.insert(key);
            System.out.println(key+" step "+legacy.step(key)+": "+r.probes()+" -> "+r.index());
        }
        System.out.println("Legacy slots: "+legacy.slots());
        ProbeTable valid=new ProbeTable(11,ProbeTable.Mode.DOUBLE_PRIME,7);
        for(int key:new int[]{44,4,16,28,21,26})valid.insert(key);
        System.out.println("Prime slots: "+valid.slots());
    }
}
