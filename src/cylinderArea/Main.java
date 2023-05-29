package cylinderArea;

public class Main {

    // main method
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);  // creating object for Circle class
        System.out.println("circle.radius= " + circle.getRadius()); // calling instance method
        System.out.println("circle.area= " + circle.getArea());  // calling instance method
        Cylinder cylinder = new Cylinder(5.55, 7.25); // creating object for Cylinder Class
        System.out.println("cylinder.radius= " + cylinder.getRadius());  // calling instance method
        System.out.println("cylinder.height= " + cylinder.getHeight());  // calling instance method
        System.out.println("cylinder.area= " + cylinder.getArea());  // calling instance method
        System.out.println("cylinder.volume= " + cylinder.getVolume());  // calling instance method

    }
}
