public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog() {
        this.breed = "Shih Tzu";
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // makeNoise() method

    @Override
    public void makeNoise() {
        System.out.println("woof.");
    }


    // toString method
    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Age: " + this.getAge() + ", Breed: " + this.breed;
    }

    // Getter
    public String getBreed() {
        return this.breed;
    }

    // Setter
    public void setBreed(String breed) {
        this.breed = breed;
    }
}