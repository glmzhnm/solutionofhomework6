package commandpattern;
public class SmartHomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOn = new TurnOnLightCommand(light);
        Command setTemperature = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.assignCommand("button1", lightOn);
        remote.assignCommand("button2", setTemperature);

        remote.pressButton("button1");
        remote.pressButton("button2");
        remote.undoButton("button2");
    }
}
