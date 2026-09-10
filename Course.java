public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    // default
    public Course() {
        this.courseName = "Intro to Nothing";
        this.instructor = new Instructor();
        this.textbook = new Textbook();
    }

    // parameterized
    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    // getters

    // setters

    @Override
    public String toString() {
        return "Course name: " + courseName +
                " | Instructor name: " + instructor.getFirstName() + " " + instructor.getLastName() +
                " | Textbook: " + textbook.getTitle() + " - Published by: " + textbook.getAuthor();
    }
}