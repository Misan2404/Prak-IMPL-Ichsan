public class MVCPatternDemo {
    public static void main(String[] args) {
        // Mengambil data course dari database
        Course model = retrieveCourseFromDatabase();
        
        // Membuat view untuk menampilkan course
        CourseView view = new CourseView();
        
        // Membuat controller
        CourseController controller = new CourseController(model, view);

        // Tampilkan data awal course
        controller.updateView();

        // Update data course
        controller.setCourseName("Python");
        System.out.println("\nAfter updating, Course Details are as follows");
        controller.updateView();
    }

    private static Course retrieveCourseFromDatabase() {
        // Simulasi pengambilan data course dari "database"
        return new Course("Java", "01", "Programming");
    }
}