public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("----------------------- SHAPE -------------------------");
        Shape s1 = new Shape();
        Shape s2 = new Shape("blue", false);

        System.out.println(s1);
        System.out.println(s2);

        s1.setColor("yellow");
        s1.setFilled(false);
        System.out.println("After modification: " + s1);

        System.out.println("\n----------------CIRCLE-------------------");
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);
        Circle c3 = new Circle(7.0, "red", true);

        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        System.out.println(c2);
        System.out.println("Area: " + c2.getArea());
        System.out.println("Perimeter: " + c2.getPerimeter());

        System.out.println(c3);
        System.out.println("Area: " + c3.getArea());
        System.out.println("Perimeter: " + c3.getPerimeter());

        System.out.println("\n----------------TEST RECTANGLE----------");
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4.0, 6.0);
        Rectangle r3 = new Rectangle(3.0, 8.0, "green", true);

        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println(r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        System.out.println(r3);
        System.out.println("Area: " + r3.getArea());
        System.out.println("Perimeter: " + r3.getPerimeter());

        System.out.println("\n------TEST SQUARE -----------");
        Square sq1 = new Square();
        Square sq2 = new Square(5.0);
        Square sq3 = new Square(4.0, "purple", false);

        System.out.println(sq1);
        System.out.println("Area: " + sq1.getArea());
        System.out.println("Perimeter: " + sq1.getPerimeter());

        System.out.println(sq2);
        System.out.println("Area: " + sq2.getArea());
        System.out.println("Perimeter: " + sq2.getPerimeter());

        System.out.println(sq3);
        System.out.println("Area: " + sq3.getArea());
        System.out.println("Perimeter: " + sq3.getPerimeter());

        sq2.setSide(10);
        System.out.println("\nAfter setSide(10): " + sq2);
        System.out.println("Area: " + sq2.getArea());
        System.out.println("Perimeter: " + sq2.getPerimeter());
    }
}
