public class CourseController {
    private Course model;
    private CourseView view;

    // Constructor
    public CourseController(Course model, CourseView view) {
        this.model = model;
        this.view = view;
    }

    // Method untuk mengubah nama Course
    public void setCourseName(String name) {
        model.setCourseName(name);
    }

    // Method untuk mendapatkan nama Course
    public String getCourseName() {
        return model.getCourseName();
    }

    // Method untuk mengubah ID Course
    public void setCourseId(String id) {
        model.setCourseId(id);
    }

    // Method untuk mendapatkan ID Course
    public String getCourseId() {
        return model.getCourseId();
    }

    // Method untuk mengubah kategori Course
    public void setCourseCategory(String category) {
        model.setCourseCategory(category);
    }

    // Method untuk mendapatkan kategori Course
    public String getCourseCategory() {
        return model.getCourseCategory();
    }

    // Method untuk memperbarui tampilan
    public void updateView() {
        view.printCourseDetails(model.getCourseName(), model.getCourseId(), model.getCourseCategory());
    }
}