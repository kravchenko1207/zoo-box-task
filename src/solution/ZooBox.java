package solution;

public class ZooBox<T extends Animal> {
    private T animal;

    public ZooBox(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void makeAnimalSound() {
        animal.makeSound();
    }
}
