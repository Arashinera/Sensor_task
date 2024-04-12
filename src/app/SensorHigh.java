package app;

public class SensorHigh extends Sensor {

    public SensorHigh(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update() {
        if (substance.getTemperature() > 0) {
            substance.setWeight(1 + 2 * (int) substance.getTemperature());
            substance.setColor(Color.BLACK);
            System.out.println("\nHere are the results of the SensorHigh observation:" +
                    "\n1) Substance temperature : " + DecimalUtil.rounderUtil(substance.getTemperature()) + " " + Constants.TEMPERATURE +
                    "\n2) Substance weight : " + substance.getWeight() + " " + Constants.WEIGHT_MEASURE +
                    "\n3) Substance color : " + substance.getColor().toString().toLowerCase());
        }
    }
}
