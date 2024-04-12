package app;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        int choice;
        int i = 0;
        double temperature;

        Substance substance = new Substance();

        new SensorLow(substance);
        new SensorHigh(substance);

        do {
            System.out.println("How many observations do you want to do: (from 1 to 100) ");
            choice = input.nextInt();
        } while (choice <= 0 || choice > 100);
        try {
            do {

                do {
                    System.out.println("\nPlease, input temperature for substance: (-100 C to 100 C)");
                    temperature = input.nextDouble();
                } while (temperature < -100 || temperature > 100);

                substance.setTemperature(temperature);

                i++;

            } while (i != choice);
        } catch (InputMismatchException exception) {
            System.out.println("Please, input double value!!!");
        }
    }
}
