/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 18, 19
 * Assumptions: All text fields are non-null and nonblank. This example stores a zip code as text without enforcing a postal format.
 */
public final class Address {
    private final String street;
    private final String city;
    private final String state;
    private final String zipCode;

    public Address() {
        this("Unknown", "Unknown", "Unknown", "00000");
    }

    public Address(String street, String city,
                   String state, String zipCode) {
        this.street = required(street);
        this.city = required(city);
        this.state = required(state);
        this.zipCode = required(zipCode);
    }

    public String getStreet() { return street; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZipCode() { return zipCode; }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }

    private static String required(String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Missing address field");
        }
        return text.trim();
    }
}
