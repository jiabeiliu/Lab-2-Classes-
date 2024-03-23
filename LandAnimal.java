public class LandAnimal extends Animal {
    private int numberOfLegs;
    private String speciesName;

    public LandAnimal(double typicalSize, double typicalWeight, boolean isPredator, int numberOfLegs, String speciesName) {
        super(typicalSize, typicalWeight, isPredator);
        this.numberOfLegs = numberOfLegs;
        this.speciesName = speciesName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Land Animal Species: " + speciesName + ", Typical Size: " + typicalSize + " cm, Typical Weight: " + typicalWeight + " kg, Predator: " + isPredator + ", Number of Legs: " + numberOfLegs);
    }
}
