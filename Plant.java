public abstract class Plant {
    private String name;
    private String type;

    public Plant(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() { return name; }
    public String getType() { return type; }

    public abstract String describe();

    static class SidrTree extends Plant {
        public SidrTree() { super("Sidr Tree", "Desert Shrub"); }

        @Override
        public String describe() {
            return "The Sidr Tree stands firm, its deep roots reach hidden water far below.";
        }
    }

    static class Lavender extends Plant {
        public Lavender() { super("Lavender (Khuzama)", "Desert Flower"); }

        @Override
        public String describe() {
            return "Purple Lavender blooms fill the cool desert air with gentle fragrance.";
        }
    }

    static class PalmTree extends Plant {
        public PalmTree() { super("Date Palm", "Desert Oasis"); }

        @Override
        public String describe() {
            return "The Date Palm rises tall, offering rare shade to desert travelers.";
        }
    }
}
