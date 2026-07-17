public class Main {
    public static void main(String[] args) {
        Television television = new Television();
        RemoteControl remote = new RemoteControl();

        // Remote works with command objects, not TV methods directly.
        remote.setCommand(new TurnOnCommand(television));
        remote.pressButton();
        remote.setCommand(new TurnOffCommand(television));
        remote.pressButton();
    }
}
