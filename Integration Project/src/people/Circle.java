//Mikayla Munroe cirle class
package people;

public class Circle {
  private double radius;
  private int x, y;
  public void setRadius(double rad) {
    radius = rad;
  }

  public double getRadius() {
    return radius;

  }

  public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
  }
  public double getDiameter() {
    return radius * 2;
  }
  public void setX(int x) {
    this.x = x;
  }
  public int getX() {
    return x;
  }
  public void setY(int y) {
    this.y = y;
  }
  public int getY() {
    return y;
  }
}
