/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 14
 */
public class MoneyArrayDemo {
    public static void main(String[] args) {
        Money[] amounts = {
            new Money(2, 5), new Money(0, 99), new Money(2, 50)
        };
        Money.selectionSort(amounts);
        Money.printList(amounts, 2);
        System.out.println("Max: " + Money.max(amounts));
    }
}
