public class Rational   {
   // Data fields for numerator and denominator
   private int numerator = 0;
   private int denominator = 1;

   /** Construct a rational with default properties */
   public Rational() {
      this(0, 1);
   }

   /** Construct a rational with specified numerator and denominator */
   public Rational(int numerator, int denominator) {
      int gcd = gcd(numerator, denominator);
      this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
      this.denominator = Math.abs(denominator) / gcd;
   }

   /** Find GCD of two numbers */
   private static int gcd(int n, int d) {
      int n1 = Math.abs(n);
      int n2 = Math.abs(d);
      int gcd = 1;
      
      for (int k = 1; k <= n1 && k <= n2; k++) {
         if (n1 % k == 0 && n2 % k == 0) 
            gcd = k;
      }
   
      return gcd;
   }

   /** Return numerator */
   public int getNumerator() {
      return numerator;
   }
   
   /** Set numerator */
   public void setNumerator(int n)
   {
      numerator = n;
   }

   /** Return denominator */
   public int getDenominator() {
      return denominator;
   }
   
   /** Set denominator */
   public void setDenominator(int d)
   {
      denominator = d;
   }

   /** Add a rational number to this rational */
   public Rational add(Rational secondRational) {
      int n = this.numerator * secondRational.getDenominator() +
         this.denominator * secondRational.getNumerator();
      int d = this.denominator * secondRational.getDenominator();
      return new Rational(n, d);
   }

   /** Subtract a rational number from this rational */
   public Rational subtract(Rational secondRational) {
      int n = numerator * secondRational.getDenominator()
         - denominator * secondRational.getNumerator();
      int d = denominator * secondRational.getDenominator();
      return new Rational(n, d);
   }

   /** Multiply a rational number to this rational */
   public Rational multiply(Rational secondRational) {
      int n = numerator * secondRational.getNumerator();
      int d = denominator * secondRational.getDenominator();
      return new Rational(n, d);
   }

   /** Divide a rational number from this rational */
   public Rational divide(Rational secondRational) {
      int n = numerator * secondRational.getDenominator();
      int d = denominator * secondRational.numerator;
      return new Rational(n, d);
   }

  
   public String toString() {
      if (denominator == 1)
         return numerator + "/1";
      else
         return numerator + "/" + denominator;
   }
   
   public boolean equals(Rational other) {
      if (this.subtract(other).getNumerator() == 0)
         return true;
      else
         return false;
   }

   

  
   public int compareTo(Rational o) {
      if (this.subtract(o).getNumerator() > 0)
         return 1;
      else if (this.subtract(o).getNumerator() < 0)
         return -1;
      else
         return 0;
   }
}