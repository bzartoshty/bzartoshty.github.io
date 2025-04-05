public class PolymorphismDemo {
   /** Main method */
   public static void main(String[] args) {
      // Display circle and rectangle properties
      GeometricObject c1 = new Circle(1,"red",false);
      displayObject(c1);
      displayObject(new Circle(1, "red", false));
      displayObject(new Rectangle(1, 1, "black", true));
   }

   /** Display geometric object properties */
   public static void displayObject(GeometricObject object) {
      System.out.println("Created on " + object.getDateCreated() +
         " Color is " + object.getColor());
   }
   
   /** Display geometric object properties */
  /* public static void displayObject(Rectangle object) {
      System.out.println("Created on " + object.getDateCreated() +
         " Color is " + object.getColor());
   }

  */ 
   
}