package people;

public class Circle {
  private double radius;
  
  public void setRadius(double rad) {
    radius = rad;
  }
 public double getRadius() {
   return radius;
   
 }
 public double calculateArea() {
   return Math.PI * Math.pow(radius, 2);
 }
}
  
