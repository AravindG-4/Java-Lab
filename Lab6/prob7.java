class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    public void makeSound() {
        System.out.println("The " + species + " makes a sound.");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String species, String breed) {
        super(species);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("The " + breed + " dog of species " + species + " barks.");
    }
}

public class prob7 {
    public static void main(String[] args) {
        Dog labrador = new Dog("Canine", "Labrador");
        labrador.makeSound();
        labrador.bark();

        Animal cat = new Animal("Feline");
        try {
            ((Dog) cat).bark(); // This line will throw ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
