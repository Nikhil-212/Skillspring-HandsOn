public class Main {
    public static void main(String[] args) {
        Student student = new Student(25, "Kiran", "Java FSE");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.setStudentName("Kiran Reddy");
        controller.updateView();
    }
}
