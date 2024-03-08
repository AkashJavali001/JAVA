package allprg;
class OuterClass {
    void display() {
        System.out.println("Outer class display method");
    }

    class InnerClass {
        void display() {
            System.out.println("Inner class display method");
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        // Create an instance of OuterClass
        OuterClass outerObject = new OuterClass();

        // Call the display method of OuterClass
        outerObject.display();

        // Create an instance of InnerClass (inside OuterClass)
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();

        // Call the display method of InnerClass
        innerObject.display();
    }
}
