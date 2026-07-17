public class Main {
    public static void main(String[] args) {
        UsbLaptop laptop = new UsbLaptop();
        HdmiDevice adapter = new UsbToHdmiAdapter(laptop);
        Projector projector = new Projector();

        // Projector accepts the adapter as an HDMI device.
        projector.display(adapter);
    }
}
