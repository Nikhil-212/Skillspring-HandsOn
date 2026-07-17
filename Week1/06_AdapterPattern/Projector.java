public class Projector {
    public void display(HdmiDevice device) {
        System.out.println("Projector is ready.");
        device.displayOnHdmi();
        System.out.println("Projector is displaying the presentation.");
    }
}
