package allprg;
//Circle class (unchanged)
class Circle extends Shape {
 private double radius;

 // Constructor
 public Circle (double radius) {
     this.radius = radius;
 }

 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }

 @Override
 public double calculatePerimeter() {
     return 2 * Math.PI * radius;
 }
}

//Triangle class (unchanged)
class Triangle extends Shape {
 private double side1;
 private double side2;
 private double side3;

 public Triangle(double side1, double side2, double side3) {
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3;
 }

 @Override
 public double calculateArea() {
     // Heron's formula for the area of a triangle
     double s = (side1 + side2 + side3) / 2;
     return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }

 @Override
 public double calculatePerimeter() {
     return side1 + side2 + side3;
 }
}

//ShapeApplication class with main method
public class ShapeApplication {
 public static void main(String[] args) {
     // Create instances of Circle and Triangle
     Circle circle = new Circle(5.0);
     Triangle triangle = new Triangle(3.0, 4.0, 5.0);

     // Display area and perimeter for Circle
     System.out.println("Circle:");
     System.out.println("Area: " + circle.calculateArea());
     System.out.println("Perimeter: " + circle.calculatePerimeter());
     System.out.println();

     // Display area and perimeter for Triangle
     System.out.println("Triangle:");
     System.out.println("Area: " + triangle.calculateArea());
     System.out.println("Perimeter: " + triangle.calculatePerimeter());
 }
}

