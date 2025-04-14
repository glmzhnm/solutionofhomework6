package commandpattern;

public class SmartHomeRemoteControl {
    private java.util.Map<String, Command> commandSlots = new java.util.HashMap<>();

    public void assignCommand(String slot, Command command) {
        commandSlots.put(slot, command);
    }

    public void pressButton(String slot) {
        if (commandSlots.containsKey(slot)) {
            commandSlots.get(slot).execute();
        }
    }

    public void undoButton(String slot) {
        if (commandSlots.containsKey(slot)) {
            commandSlots.get(slot).undo();
        }
    }
}
