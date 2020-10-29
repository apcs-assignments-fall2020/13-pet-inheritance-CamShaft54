public class DogClient {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.toString());
        Dog d2 = new Dog("Maximum", 9001, "Great Dane");
        System.out.println(d2.toString());
        d2.setBreed("Dachshund");
        System.out.println(d2.getBreed());
        d2.makeNoise();
    }
}