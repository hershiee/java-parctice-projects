package GalaxyWeatherAdvisor;
import java.util.*;
public class GalaxyWeatherAdvisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Galactic Weather Advisor!");

        System.out.println("Please enter planet you are on (Earth, Mars, Venus, Jupiter): ");
        String planet = sc.nextLine();

        System.out.println("Please enter the current temperature in Celsius: ");
        double temperature = sc.nextDouble();

        String advice = "";


        if (planet.equals("earth")) {
            if (temperature < 0) advice = "It's freezing on Earth! Wear a heavy coat.";
            else if (temperature < 15) advice = "It's quite chilly on Earth. Wear a jacket.";
            else if (temperature < 25) advice = "The weather on Earth is pleasant. A light sweater should be enough.";
            else advice = "It's warm on Earth. Wear something light!";
        }
        else if (planet.equalsIgnoreCase("mars")) {
            if (temperature < -60) advice = "It's extremely cold on Mars! Wear a space suit with thermal insulation.";
            else if (temperature < 0) advice = "It's very cold on Mars. Wear a thermal suit.";
            else advice = "It's unusually warm on Mars. Enjoy the rare warmth!";
        }
        else if (planet.equalsIgnoreCase("venus")) {
            if (temperature < 400) advice = "It's incredibly hot on Venus! Stay indoors with air conditioning.";
            else advice = "It's scorching hot on Venus. Avoid going outside!";
        }
        else if (planet.equalsIgnoreCase("jupiter")) {
            if (temperature < -100) advice = "It's freezing on Jupiter! Stay in your heated space module.";
            else if (temperature < -50) advice = "It's very cold on Jupiter. Wear a thermal space suit.";
            else advice = "It's surprisingly warm on Jupiter. Enjoy the pleasant temperature!";
        }
        else {
            advice = "Unknown planet! Please enter a valid planet name.";
        }
        System.out.println(advice);
        sc.close();
    }

}
