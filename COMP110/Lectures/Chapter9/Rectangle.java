public class Rectangle {
   private double width;
   private double length;
  
  // default constructor 
   public Rectangle(){
      this(1,1);
   }

   public Rectangle(double length, double width){
    this.length = length;
    this.width = width;
   }
  
     public void setWidth(double w){
      width = w;
   }
   
   public void setLength(double len){
      length = len;
   }
   
   public double getWidth() {
      return width;
   }
  
   public double getLength() {
      return length;
   }
  
   public double getArea() {
      return length * width;
   }
   
}