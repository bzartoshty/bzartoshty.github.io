public class TestCircle {
  /** Main method */
  public static void main(String[] args) {
      // Create a Circle with radius 5.0
    MyCircle c1 = 
      new MyCircle(5.0);
      System.out.println(c1);
    System.out.println("The area of the circle of radius "
      + c1.getRadius() + " is " + c1.getArea());

    // Increase myCircle's radius by 10%
    c1.setRadius(c1.getRadius() * 1.1);
    System.out.println("The area of the circle of radius "
      + c1.getRadius() + " is " + c1.getArea());
    
    System.out.println("The number of objects created is "
      + MyCircle.getNumberOfObjects());
    MyCircle c2 = new MyCircle(5.0);
    MyCircle c3 = new MyCircle(0.0);
  System.out.println("The number of objects created is "
      + MyCircle.getNumberOfObjects());

  }
}