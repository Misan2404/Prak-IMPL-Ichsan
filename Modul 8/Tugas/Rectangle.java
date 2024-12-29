public class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Rectangle");
    }

    @Override
    void move() {
        System.out.println("Moving Rectangle");
    }

    @Override
    void resize() {
        System.out.println("Resizing Rectangle");
    }
}