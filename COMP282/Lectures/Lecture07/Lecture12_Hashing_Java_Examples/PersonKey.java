/**
 * COMP 182 - Hashing
 * Slides 9, 13
 * Immutable equality key; all fields non-null. Use an empty String for no middle name.
 */
import java.time.LocalDate;
import java.util.Objects;
public final class PersonKey {
    private final String first, middle, last;
    private final LocalDate birthDate;
    public PersonKey(String first, String middle, String last, LocalDate birthDate) {
        this.first = Objects.requireNonNull(first);
        this.middle = Objects.requireNonNull(middle);
        this.last = Objects.requireNonNull(last);
        this.birthDate = Objects.requireNonNull(birthDate);
    }
    @Override public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof PersonKey p)) return false;
        return first.equals(p.first) && middle.equals(p.middle)
            && last.equals(p.last) && birthDate.equals(p.birthDate);
    }
    @Override public int hashCode() {
        int h = first.hashCode();
        h = 31 * h + middle.hashCode();
        h = 31 * h + last.hashCode();
        return 31 * h + birthDate.hashCode();
    }
}
