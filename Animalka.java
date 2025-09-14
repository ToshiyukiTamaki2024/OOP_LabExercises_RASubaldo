public class Animalka {
    public static void main(String[] args) {
        // 1. Create a new Bird object with the specified breed "Canary"
        Bird bird1 = new Bird("Harry", "Canary");

        // 2. Create a second Bird object using the default constructor
        Bird bird2 = new Bird();

        // 3. Print the initial details of the first bird
        System.out.println(bird1.getData()); // Output -> Name: Tweety, Breed: Canary

        // 4. Set the name and breed for the second bird
        bird2.setName("Mike");
        bird2.setBreed("Lovebird");

        // 5. Print the details of the second bird after modifying it
        System.out.println(bird2.getData()); // Output -> Name: Zazu, Breed: Hornbill
    }
}