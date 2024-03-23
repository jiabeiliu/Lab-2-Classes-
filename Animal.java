public abstract class Animal {
    protected double typicalSize;
    protected double typicalWeight;
    protected boolean isPredator;

    public Animal(double typicalSize, double typicalWeight, boolean isPredator) {
        this.typicalSize = typicalSize;
        this.typicalWeight = typicalWeight;
        this.isPredator = isPredator;
    }

    public abstract void displayInfo();
}
