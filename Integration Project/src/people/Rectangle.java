//Mikayla Munroe rectangle class with methods that calculate area
package people;

public class Rectangle {
  private int width;
  private int height;

  public int getWidth() {
    return width;
  }

  // method name and parameters
  public void setWidth(int wid) {
    width = wid;

  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int hei) {
    height = hei;
  }

  public int calcArea() {
    return width * height;
  }

}
