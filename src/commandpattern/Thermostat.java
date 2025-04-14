package commandpattern;

public class Thermostat {
    private int temperature = 20;

    public void setTemperature(int temperature) {
        System.out.println("[Thermostat] Setting temperature to " + temperature);
        this.temperature = temperature;
    }

    public void resetTemperature() {
        System.out.println("[Thermostat] previous temperature " + this.temperature);
    }
}
