public class UsbToHdmiAdapter implements HdmiDevice {
    private UsbLaptop laptop;

    public UsbToHdmiAdapter(UsbLaptop laptop) {
        this.laptop = laptop;
    }

    public void displayOnHdmi() {
        // Adapter converts the expected HDMI request to USB behavior.
        laptop.sendUsbData();
        System.out.println("Adapter converted USB signal to HDMI signal.");
    }
}
