public class CastingDemo {
  /** Main method */
  public static void main(String[] args) {
    // Create and initialize two objects
    Circle c1 = new Circle(5);
    Circle c2 = new Circle(5);
    System.out.println(c1.equals(c2));
    Object object1 = new Circle(1);
    Object object2 = new Rectangle(1, 1);
    System.out.println(object2.equals(object1));
         

    // Display circle and rectangle
    displayObject(object1);
    displayObject(object2);
  }

  /** A method for displaying an object */
  public static void displayObject(Object object) {
    if (object instanceof Circle) {
    System.out.println("The circle radius is " +
        ((Circle)object).getRadius());
      System.out.println("The circle area is " +
        ((Circle)object).getArea());
      System.out.println("The circle diameter is " +
        ((Circle)object).getDiameter());
    }
    else if (object instanceof 
                  Rectangle) { 
      System.out.println("The rectangle area is " +
        ((Rectangle)object).getArea());
    }
  }
}