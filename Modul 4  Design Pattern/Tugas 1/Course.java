public class Course {
    private String courseName;
    private String courseId;
    private String courseCategory;

    // Constructor
    public Course(String courseName, String courseId, String courseCategory) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseCategory = courseCategory;
    }

    // Getter dan Setter untuk CourseId
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    // Getter dan Setter untuk CourseName
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Getter dan Setter untuk CourseCategory
    public String getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(String courseCategory) {
        this.courseCategory = courseCategory;
    }
}