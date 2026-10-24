/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 50, 51, 52, 53, 54, 55, 56, 57, 58
 * Assumptions: Objects are immutable. Denominator is positive. The reduced numerator and denominator fit in int. Arithmetic uses long intermediates and rejects unrepresentable reduced results. Object arguments are non-null.
 */
public final class Rational {
    private final int numerator;
    private final int denominator;

    public Rational() {
        this(0, 1);
    }

    public Rational(int numerator, int denominator) {
        this((long) numerator, (long) denominator);
    }

    private Rational(long n, long d) {
        if (d == 0) {
            throw new IllegalArgumentException("Zero denominator");
        }
        if (d < 0) { n = -n; d = -d; }
        long divisor = gcd(Math.abs(n), d);
        this.numerator = Math.toIntExact(n / divisor);
        this.denominator = Math.toIntExact(d / divisor);
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public int getNumerator() { return numerator; }
    public int getDenominator() { return denominator; }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Rational add(Rational other) {
        long n = (long) numerator * other.denominator
               + (long) other.numerator * denominator;
        long d = (long) denominator * other.denominator;
        return new Rational(n, d);
    }

    public Rational subtract(Rational other) {
        long n = (long) numerator * other.denominator
               - (long) other.numerator * denominator;
        long d = (long) denominator * other.denominator;
        return new Rational(n, d);
    }

    public Rational multiply(Rational other) {
        return new Rational((long) numerator * other.numerator,
            (long) denominator * other.denominator);
    }

    public Rational divide(Rational other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return new Rational((long) numerator * other.denominator,
            (long) denominator * other.numerator);
    }

    public int compareTo(Rational other) {
        long left = (long) numerator * other.denominator;
        long right = (long) other.numerator * denominator;
        return Long.compare(left, right);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Rational)) return false;
        Rational other = (Rational) object;
        return numerator == other.numerator
            && denominator == other.denominator;
    }

    @Override
    public int hashCode() {
        return 31 * numerator + denominator;
    }
}
