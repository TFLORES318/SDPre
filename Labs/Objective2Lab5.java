public class Objective2Lab5 {
  public static void main(String[] args) {
    double side1, side2, x, y, hypotenuse;

    side1 = 8.7;
    side2 = 10.4;
    x = side1*side1;
    y = side2*side2;

    hypotenuse = Math.sqrt(x+y);

    System.out.println( "The hypotenuse of triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse );

  }
}
