package app;

public class SensorLow extends Sensor {

    public SensorLow(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update() {
        if (substance.getTemperature() <= 0) {
            substance.setWeight(1);
            substance.setColor(Color.WHITE);
            System.out.println("\nHere are the results of the SensorLow observation:" +
                    "\n1) Substance temperature : " + DecimalUtil.rounderUtil(substance.getTemperature()) + " " + Constants.TEMPERATURE +
                    "\n2) Substance weight : " + substance.getWeight() + " " + Constants.WEIGHT_MEASURE +
                    "\n3) Substance color : " + substance.getColor().toString().toLowerCase());
        }

    }
}
