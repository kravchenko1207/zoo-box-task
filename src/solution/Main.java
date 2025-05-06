package solution;

public class Main {
    public static void main(String[] args) {
        ZooBox<Dog> dogZooBox= new ZooBox<>(new Dog());
        dogZooBox.makeAnimalSound();

        ZooBox<Cat> catZooBox = new ZooBox<>(new Cat());
        catZooBox.makeAnimalSound();
    }
}
