public class StudentView {
    // View is responsible only for showing student details.
    public void displayStudentDetails(int rollNumber, String name, String course) {
        System.out.println("Student Details");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}
