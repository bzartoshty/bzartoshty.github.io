/**
 * COMP 182 - Hashing
 * Slides 7, 8, 10, 11, 12, 14
 * Primitive and String hashes; compression capacity must be positive; masking requires power of two.
 */
public class HashCodeExamples {
    static int stringHash(String s) {
        int h = 0;
        for (int i = 0; i < s.length(); i++) {
            h = 31 * h + s.charAt(i);
        }
        return h;
    }
    public static void main(String[] args) {
        long integral = 0x123456789ABCDEFL;
        int folded = (int) (integral ^ (integral >>> 32));
        System.out.println("long matches: " + (folded == Long.hashCode(integral)));
        float value = 12.2f;
        double key = 12.2;
        int a = Float.hashCode(value);
        long bits = Double.doubleToLongBits(key);
        int b = (int) (bits ^ (bits >>> 32));
        System.out.println("float hash: " + a);
        System.out.println("double matches: " + (b == Double.hashCode(key)));
        System.out.println("ab: " + stringHash("ab"));
        System.out.println("ba: " + stringHash("ba"));
        System.out.println("String matches: " + (stringHash("Java") == "Java".hashCode()));
        int hashCode = -1, m = 10;
        int index = Math.floorMod(hashCode, m);
        int mixedHash = 11, powerOfTwoCapacity = 4;
        int index2 = mixedHash & (powerOfTwoCapacity - 1);
        System.out.println("remainder: " + hashCode % m);
        System.out.println("floorMod: " + index);
        System.out.println("masked: " + index2);
        System.out.println("minimum int index: " + Math.floorMod(Integer.MIN_VALUE, m));
        for (int integerKey : new int[]{519,214,1001,3744})
            System.out.println(integerKey + " home: " + Math.floorMod(integerKey,10));
    }
}
