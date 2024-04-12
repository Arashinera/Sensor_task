package app;

import java.util.ArrayList;
import java.util.List;

public class Substance {

    private final List<Sensor> sensors = new ArrayList<>();
    private Color color;
    private int weight;
    private double temperature;

    public int getWeight() {
        return weight;
    }

    public double getTemperature() {
        return temperature;
    }

    public Color getColor() {
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        updateAllSensors();
    }

    public void attach(Sensor sensor) {
        sensors.add(sensor);
    }

    public void updateAllSensors() {
        for (Sensor sensor : sensors) {
            sensor.update();
        }
    }
}
