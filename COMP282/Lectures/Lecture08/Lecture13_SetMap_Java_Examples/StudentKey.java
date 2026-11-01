import java.util.Objects;
/** Immutable ID determines identity; display names are stored separately. */
public record StudentKey(String id) {
    public StudentKey { Objects.requireNonNull(id); }
}
