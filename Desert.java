
public class Desert {
    private String   name;
    private Animal[] animals;
    private Plant[]  plants;
    private Weather  weather;

    public Desert(String name, Animal[] animals, Plant[] plants, Weather weather) {
        this.name    = name;
        this.animals = animals;
        this.plants  = plants;
        this.weather = weather;
    }

    public void displayScene() {
        System.out.println("NAFUD DESERT - " + weather.getSeason().toUpperCase()
                         + " | " + weather.getTimeOfDay().toUpperCase());
        System.out.println(weather.getDescription());
        System.out.println("Temperature: " + weather.getTemperature() + " C");

        System.out.println("\nPLANTS OF THE NAFUD");
        for (Plant p : plants)
            System.out.println("- " + p.getName() + ": " + p.describe());

        System.out.println("\nWILDLIFE");
        for (Animal a : animals) {
            System.out.println("- " + a.getName());
            System.out.println("  " + a.getDescription());
            System.out.println(" what animal doing now at usual: " + a.describeActivity(weather.getTimeOfDay()));
        }
    }
}