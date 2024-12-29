public class Circle extends Shape {
    private double radius;
    private Point center;

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Circle");
    }

    @Override
    void move() {
        System.out.println("Moving Circle");
    }

    @Override
    void resize() {
        System.out.println("Resizing Circle");
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}