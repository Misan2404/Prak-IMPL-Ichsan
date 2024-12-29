public class Window {
    public void open() {
        System.out.println("Opening Window");
    }

    public void close() {
        System.out.println("Closing Window");
    }

    public void move() {
        System.out.println("Moving Window");
    }

    public void display() {
        System.out.println("Displaying Window");
    }

    public void handleEvent(String event) {
        System.out.println("Handling Event: " + event);
    }
}

class DialogBox extends Window {
}

class ConsoleWindow extends Window {
}

class DataController {
}