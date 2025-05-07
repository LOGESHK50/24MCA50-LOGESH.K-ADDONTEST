package prb;


public class Rectangle {
    private int length, breadth;

    public Rectangle() {
        this.length = 1;
        this.breadth = 1;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);
        System.out.println("Area (default): " + r1.getArea());
        System.out.println("Area (5,10): " + r2.getArea());
    }
}