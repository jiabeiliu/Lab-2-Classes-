public class Fish extends Animal {
    private int numberOfFins;
    private String speciesName;

    public Fish(double typicalSize, double typicalWeight, boolean isPredator, int numberOfFins, String speciesName) {
        super(typicalSize, typicalWeight, isPredator);
        this.numberOfFins = numberOfFins;
        this.speciesName = speciesName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fish Species: " + speciesName + ", Typical Size: " + typicalSize + " cm, Typical Weight: " + typicalWeight + " kg, Predator: " + isPredator + ", Number of Fins: " + numberOfFins);
    }
}
