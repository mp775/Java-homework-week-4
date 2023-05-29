package poolArea;
/* 20. Pool Area
The Swimming Company has asked you to write an application that calculates the volume of cuboid shaped pools.
 */

public class Main {

    // main method
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);  // creating object
        System.out.println("rectangle.width= " + rectangle.getWidth());  // calling instance method
        System.out.println("rectangle.length= " + rectangle.getLength());  // calling instance method
        System.out.println("rectangle.area= " + rectangle.getArea());  // calling instance method

        Cuboid cuboid = new Cuboid(5,10,5); // creating object
        System.out.println("cuboid.width= " + cuboid.getWidth()); // calling instance method
        System.out.println("cuboid.length= " + cuboid.getLength()); // calling instance method
        System.out.println("cuboid.area= " + cuboid.getArea()); // calling instance method
        System.out.println("cuboid.height= " + cuboid.getHeight()); // calling instance method
        System.out.println("cuboid.volume= " + cuboid.getVolume()); // calling instance method
    }
}
