/**
 * COMP 182 - Priority Queues and Binary Heaps
 * Slides 2, 32
 * Tie-breaking example; caller assigns unique increasing sequence numbers without wraparound.
 */
import java.util.PriorityQueue;

public class StablePriorityQueueDemo {
    private static final class Job implements Comparable<Job> {
        final String name;
        final int priority;
        final long sequence;
        Job(String name, int priority, long sequence) {
            this.name = name; this.priority = priority; this.sequence = sequence;
        }
        @Override public int compareTo(Job other) {
            // Smaller priority value is more urgent. Arrival breaks a tie.
            int order = Integer.compare(priority, other.priority);
            return order != 0 ? order : Long.compare(sequence, other.sequence);
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Job> jobs = new PriorityQueue<>();
        jobs.offer(new Job("routine", 3, 0));
        jobs.offer(new Job("urgent first", 1, 1));
        jobs.offer(new Job("urgent second", 1, 2));
        while (!jobs.isEmpty()) System.out.println(jobs.poll().name);
    }
}
