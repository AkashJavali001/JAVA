package allprg;
//Superclass
class Shape {
 public void draw() {
     System.out.println("Drawing a generic shape");
 }

 public void erase() {
     System.out.println("Erasing a generic shape");
 }

 public void displayDetails() {
     System.out.println("Details for a generic shape:");
     System.out.println("Radius: Not defined");
     System.out.println("Sides: Not defined");
 }

 public void displayArea() {
     System.out.println("Area: Not defined for a generic shape");
 }

 public void displayPerimeter() {
     System.out.println("Perimeter: Not defined for a generic shape");
 }
}

//Subclass Circle
class Circle extends Shape {
 private double radius = 5.0; // Pre-defined radius for demonstration purposes

 @Override
 public void draw() {
     System.out.println("Drawing a circle");
 }

 @Override
 public void erase() {
     System.out.println("Erasing a circle");
 }

 @Override
 public void displayDetails() {
     System.out.println("Details for a circle:");
     System.out.println("Radius: " + radius);
     System.out.println("Sides: Not defined");
 }

 @Override
 public void displayArea() {
     double area = Math.PI * radius * radius;
     System.out.println("Area of the circle: " + area);
 }

 @Override
 public void displayPerimeter() {
     double perimeter = 2 * Math.PI * radius;
     System.out.println("Perimeter of the circle: " + perimeter);
 }
}

//Subclass Triangle
class Triangle extends Shape {
 private double sides = 3.0; // Pre-defined number of sides for demonstration purposes

 @Override
 public void draw() {
     System.out.println("Drawing a triangle");
 }

 @Override
 public void erase() {
     System.out.println("Erasing a triangle");
 }

 @Override
 public void displayDetails() {
     System.out.println("Details for a triangle:");
     System.out.println("Radius: Not defined");
     System.out.println("Sides: " + sides);
 }

 @Override
 public void displayArea() {
     double area = (Math.sqrt(3) / 4) * sides * sides;
     System.out.println("Area of the triangle: " + area);
 }

 @Override
 public void displayPerimeter() {
     double perimeter = 3 * sides;
     System.out.println("Perimeter of the triangle: " + perimeter);
 }
}

//Subclass Square
class Square extends Shape {
 private double sides = 4.0; // Pre-defined number of sides for demonstration purposes

 @Override
 public void draw() {
     System.out.println("Drawing a square");
 }

 @Override
 public void erase() {
     System.out.println("Erasing a square");
 }

 @Override
 public void displayDetails() {
     System.out.println("Details for a square:");
     System.out.println("Radius: Not defined");
     System.out.println("Sides: " + sides);
 }

 @Override
 public void displayArea() {
     double area = sides * sides;
     System.out.println("Area of the square: " + area);
 }

 @Override
 public void displayPerimeter() {
     double perimeter = 4 * sides;
     System.out.println("Perimeter of the square: " + perimeter);
 }
}

//Main program
public class ShapeDemo {
 public static void main(String[] args) {
     // Create an array of Shape objects
     Shape[] shapes = new Shape[3];
     shapes[0] = new Circle();
     shapes[1] = new Triangle();
     shapes[2] = new Square();

     // Demonstrate polymorphism by calling draw, erase, area, and perimeter methods
     for (Shape shape : shapes) {
         shape.draw();
         shape.erase();
         shape.displayDetails();
         shape.displayArea();
         shape.displayPerimeter();
         System.out.println(); // Add a newline for better readability
     }
 }

 @Override
 public void displayPerimeter() {
     double perimeter = 4 * sides;
     System.out.println("Perimeter of the square: " + perimeter);
 }
}

//Main program
public class ShapeDemo {
 public static void main(String[] args) {
     // Create an array of Shape objects
     Shape[] shapes = new Shape[3];
     shapes[0] = new Circle();
     shapes[1] = new Triangle();
     shapes[2] = new Square();

     // Demonstrate polymorphism by calling draw, erase, area, and perimeter methods
     for (Shape shape : shapes) {
         shape.draw();
         shape.erase();
         shape.displayArea();
         shape.displayPerimeter();
         System.out.println(); // Add a newline for better readability
     }
 }
}

