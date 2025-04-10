// Define the circle class with two constructors
class Circle {
 private  double radius;

  /** Construct a circle with radius 1 */
  Circle() {
    radius = 1;
  }

  /** Construct a circle with a specified radius */
  Circle(double newRadius) {
    radius = newRadius;
  }

  /** Return the area of this circle */
  double getArea() {
    return radius * radius * Math.PI;
  }

  /** Return the perimeter of this circle */
  double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  /** Set a new radius for this circle */
  void setRadius(double newRadius) {
    radius = newRadius;
  }
  
  double getRadius() {
   return radius;
  }
}