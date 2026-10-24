/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 4, 5, 6, 7, 8, 9, 11, 12, 13
 * Assumptions: Amounts are nonnegative. Cents range from 0 through 99. Arithmetic results must fit a nonnegative int dollar field. Object arguments and array elements are non-null.
 */
public class Money {
    private int dollars;
    private int cents;

    public Money() { this(0, 0); }

    public Money(int dollars, int cents) {
        validate(dollars, cents);
        this.dollars = dollars;
        this.cents = cents;
    }

    private Money(long totalCents) {
        this(Math.toIntExact(totalCents / 100),
             (int) (totalCents % 100));
    }

    public int getDollars() { return dollars; }
    public int getCents() { return cents; }

    public void setDollars(int dollars) {
        validate(dollars, cents);
        this.dollars = dollars;
    }

    public void setCents(int cents) {
        validate(dollars, cents);
        this.cents = cents;
    }

    private static void validate(int dollars, int cents) {
        if (dollars < 0 || cents < 0 || cents > 99) {
            throw new IllegalArgumentException("Invalid amount");
        }
    }

    private long totalCents() {
        return (long) dollars * 100 + cents;
    }

    public Money add(Money other) {
        return new Money(totalCents() + other.totalCents());
    }

    public Money subtract(Money other) {
        long difference = totalCents() - other.totalCents();
        return difference < 0 ? null : new Money(difference);
    }

    public int compareTo(Money other) {
        return Long.compare(totalCents(), other.totalCents());
    }

    @Override
    public String toString() {
        return "$" + dollars + "."
            + (cents < 10 ? "0" : "") + cents;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Money)) return false;
        Money other = (Money) object;
        return dollars == other.dollars && cents == other.cents;
    }

    @Override
    public int hashCode() { return 31 * dollars + cents; }

    public static void selectionSort(Money[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].compareTo(list[smallest]) < 0) {
                    smallest = j;
                }
            }
            Money temp = list[i];
            list[i] = list[smallest];
            list[smallest] = temp;
        }
    }

    public static Money max(Money[] list) {
        if (list.length == 0) {
            throw new IllegalArgumentException("Empty list");
        }
        Money best = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(best) > 0) best = list[i];
        }
        return best;
    }

    public static void printList(Money[] list, int perLine) {
        if (perLine < 1) {
            throw new IllegalArgumentException("Invalid line size");
        }
        for (int i = 0; i < list.length; i++) {
            if (i > 0 && i % perLine != 0) System.out.print(" ");
            System.out.print(list[i]);
            if ((i + 1) % perLine == 0 || i == list.length - 1) {
                System.out.println();
            }
        }
    }
}
