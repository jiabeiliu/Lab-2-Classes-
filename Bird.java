public class Bird extends Animal {
    private double wingspan;
    private String speciesName;

    public Bird(double typicalSize, double typicalWeight, boolean isPredator, double wingspan, String speciesName) {
        super(typicalSize, typicalWeight, isPredator);
        this.wingspan = wingspan;
        this.speciesName = speciesName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bird Species: " + speciesName + ", Typical Size: " + typicalSize + " cm, Typical Weight: " + typicalWeight + " kg, Predator: " + isPredator + ", Wingspan: " + wingspan + " cm");
    }
}
