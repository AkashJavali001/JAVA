package allprg;
public class MyPoint {
    private int x;
    private int y;

    // Default constructor
    public MyPoint() {
        // Default location (0,0)
        this.x = 0;
        this.y = 0;
    }

    // Method to set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // toString method to represent the point as a string
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // Method to calculate distance between two points
    public double distance(MyPoint another) {
        int deltaX = this.x - another.x;
        int deltaY = this.y - another.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Method to calculate distance between the point and the origin (0,0)
    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        // Create an instance of MyPoint using the default constructor
        MyPoint point1 = new MyPoint();

        // Set new coordinates using setXY method
        point1.setXY(3, 4);

        // Display the point using toString method
        System.out.println("Point 1: " + point1.toString());

        // Create another instance of MyPoint with custom coordinates
        MyPoint point2 = new MyPoint();
        point2.setXY(-1, 2);

        // Display the second point using toString method
        System.out.println("Point 2: " + point2.toString());

        // Calculate and display the distance between Point 1 and Point 2
        double distance = point1.distance(point2);
        System.out.println("Distance between Point 1 and Point 2: " + distance);

        // Calculate and display the distance between Point 1 and the origin
        double distanceToOrigin = point1.distanceToOrigin();
        System.out.println("Distance between Point 1 and the origin: " + distanceToOrigin);
    }
}
