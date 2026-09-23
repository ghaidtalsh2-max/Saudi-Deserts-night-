public abstract class Animal {
    private String name;
    private String habitat;

    public Animal(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public String getName() { return name; }
    public String getHabitat() { return habitat; }

    public abstract String getDescription();
    public abstract String describeActivity(String timeOfDay);

    static class Falcon extends Animal {
        public Falcon() { super("Falcon", "Open Desert Sky"); }

        @Override
        public String getDescription() {
            return "The Falcon is a symbol of pride in Saudi Arabia. It has many breeds, each valued for its speed and skill. Every October, falconers gather for the hunting season, auctions, and competitions. Falconry is a cherished tradition passed down through generations.";
        }

        @Override
        public String describeActivity(String timeOfDay) {
            if (timeOfDay.equals("morning"))
                return "The Falcon soars high on warm thermals above the scorching dunes.";
            else
                return "The Falcon glides low, hunting silently in the cool evening air.";
        }
    }

    static class Camel extends Animal {
        public Camel() { super("Camel", "Nafud Desert Dunes"); }

        @Override
        public String getDescription() {
            return "The Camel is one of the greatest symbols of Saudi Arabia. Camels have dedicated breeders who raise them with pride. Festivals like Mazayen Al-Ibl celebrate the finest breeds, drawing thousands of visitors to admire their beauty and strength.";
        }

        @Override
        public String describeActivity(String timeOfDay) {
            if (timeOfDay.equals("morning"))
                return "The Camel trudges steadily across the blazing sand.";
            else
                return "The Camel rests, chewing cud in the pleasant cool of the evening.";
        }
    }

    static class ArabianLeopard extends Animal {
        public ArabianLeopard() { super("Arabian Leopard", "Mountains and Desert Edges"); }

        @Override
        public String getDescription() {
            return "The Arabian Leopard is one of the rarest big cats in the world and is found exclusively in the Arabian Peninsula. It lives in the mountains and desert fringes of Saudi Arabia, and efforts are underway to protect and preserve this endangered treasure.";
        }

        @Override
        public String describeActivity(String timeOfDay) {
            if (timeOfDay.equals("morning"))
                return "The Arabian Leopard rests in rocky shade, hidden from the blazing sun.";
            else
                return "The Arabian Leopard prowls the dark desert, hunting silently in the night.";
        }
    }
}
