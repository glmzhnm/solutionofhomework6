package commandpattern;
public class GoodnightCommand implements Command {
    private TurnOnLightCommand lightOff;
    private SetThermostatCommand setCool;

    public GoodnightCommand(Light light, Thermostat thermostat) {
        this.lightOff = new TurnOnLightCommand(light); // Turn off lights
        this.setCool = new SetThermostatCommand(thermostat, 18); // Set thermostat
    }

    public void execute() {
        lightOff.execute();
        setCool.execute();
    }

    public void undo() {
        lightOff.undo();
        setCool.undo();
    }
}
