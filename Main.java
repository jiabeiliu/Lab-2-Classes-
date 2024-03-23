public class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird(100, 6.5, true, 200, "Eagle");
        LandAnimal tiger = new LandAnimal(300, 200, true, 4, "Tiger");
        Fish salmon = new Fish(70, 1.4, false, 2, "Salmon");

        eagle.displayInfo();
        tiger.displayInfo();
        salmon.displayInfo();
    }
}
