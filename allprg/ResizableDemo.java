package allprg;
//Resizable interface
interface Resizable {
 void resizeWidth(double percentage);
 void resizeHeight(double percentage);
}

//Rectangle class implementing Resizable interface
class Rectangle implements Resizable {
 private double width;
 private double height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 public double getWidth() {
     return width;
 }

 public double getHeight() {
     return height;
 }

 @Override
 public void resizeWidth(double percentage) {
     width *= 1 + (percentage / 100);
 }

 @Override
 public void resizeHeight(double percentage) {
     height *= 1 + (percentage / 100);
 }
}

//Main program
public class ResizableDemo {
 public static void main(String[] args) {
     // Create an instance of Rectangle
     Rectangle rectangle = new Rectangle(100.0, 150.0);

     // Display original dimensions
     System.out.println("Original Dimensions:");
     System.out.println("Width: " + rectangle.getWidth());
     System.out.println("Height: " + rectangle.getHeight());

     // Resize the rectangle (increase width and height by 20%)
     rectangle.resizeWidth(20);
     rectangle.resizeHeight(20);

     // Display resized dimensions
     System.out.println("\nResized Dimensions:");
     System.out.println("Width: " + rectangle.getWidth());
     System.out.println("Height: " + rectangle.getHeight());
 }
}

