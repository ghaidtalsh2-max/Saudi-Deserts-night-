public class Weather {
    private String season;
    private String timeOfDay;

    public Weather(String season, String timeOfDay) {
        this.season    = season;
        this.timeOfDay = timeOfDay;
    }

    public String getSeason()    { return season; }
    public String getTimeOfDay() { return timeOfDay; }

    public double getTemperature() {
        double base;
        if (season.equals("summer"))  base = 42.0;
        else if(season.equals("winter"))  base = 12.0;
        else base = 27.0;
        return timeOfDay.equals("morning") ? base + 5.0 : base - 5.0;
    }
    public String getDescription() {
        if (season.equals("summer") && timeOfDay.equals("morning"))
            return "Blazing hot morning - the sand burns and the air shimmers.";
        else if (season.equals("summer") && timeOfDay.equals("evening"))
            return "Hot evening - a dry breeze rolls over the dunes.";
        else if (season.equals("winter") && timeOfDay.equals("morning"))
            return "Cool crisp morning - mist lingers near the desert floor.";
        else if (season.equals("winter") && timeOfDay.equals("evening"))
            return "Cold night - stars blaze above the silent Nafud.";
        else if (timeOfDay.equals("morning"))
            return "Warm morning - the desert slowly wakes under a golden sun.";
        else
            return "Mild evening - the sky turns amber over the endless dunes.";
    }
}