public class Main {
    public static void main(String[] args) {
        // Test Shapes
        Point center = new Point(5, 5);
        Circle circle = new Circle(10, center);
        Rectangle rectangle = new Rectangle();
        Polygon polygon = new Polygon();

        circle.draw();
        System.out.println("Circle Area: " + circle.area());
        circle.move();

        rectangle.draw();
        rectangle.resize();

        polygon.draw();
        polygon.erase();

        // Test Window
        Window window = new Window();
        window.open();
        window.display();
        window.handleEvent("Click");

        // Test Drawing Context
        DrawingContext context = new DrawingContext();
        context.setPoint();
        context.clearScreen();
        context.getVerticalSize();
    }
}