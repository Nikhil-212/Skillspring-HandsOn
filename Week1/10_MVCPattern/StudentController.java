public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        // Controller updates the model based on user action.
        model.setName(name);
    }

    public void updateView() {
        view.displayStudentDetails(model.getRollNumber(), model.getName(), model.getCourse());
    }
}
