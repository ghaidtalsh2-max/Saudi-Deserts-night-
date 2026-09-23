import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO THE NAFUD DESERT EXPERIENCE");
        System.out.print("Enter time of day (morning / evening): ");
        String timeOfDay = scanner.nextLine().trim().toLowerCase();

        if (!timeOfDay.equals("morning") && !timeOfDay.equals("evening")) {
            System.out.println("Invalid. Defaulting to morning.");
            timeOfDay = "morning";
        }

        String[] seasons = {"summer", "winter", "spring", "autumn"};
        String season = seasons[new Random().nextInt(seasons.length)];
        System.out.println("Season this run: " + season.toUpperCase());

        Weather weather = new Weather(season, timeOfDay);

        Animal[] animals = {
            new Animal.Falcon(),
            new Animal.Camel(),
            new Animal.ArabianLeopard()
        };

        Plant[] plants = {
            new Plant.SidrTree(),
            new Plant.Lavender(),
            new Plant.PalmTree()
        };

        Desert nafud = new Desert("Nafud Desert, Saudi Arabia", animals, plants, weather);
        nafud.displayScene();

        scanner.close();
    }
}
