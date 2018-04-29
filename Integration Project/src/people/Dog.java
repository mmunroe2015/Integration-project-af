//Mikayla Munroe dog class which extends from pet class
package people;

public class Dog extends Pet {
  double size;
  String breed;

  // override method
  public void sayName() {
    System.out.println("i am a mf dog");
  }

  public double getSize() {
    return size;

  }

  public void setSize(double siz) {
    size = siz;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String bre) {
    breed = bre;
  }

}
