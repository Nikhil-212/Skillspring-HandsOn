public class TurnOnCommand implements Command {
    private Television television;

    public TurnOnCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        // Command delegates actual work to the receiver.
        television.turnOn();
    }
}
