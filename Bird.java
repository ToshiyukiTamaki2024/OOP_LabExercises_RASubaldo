public class Bird {
    // Attributes (instance variables)
    private String name;
    private String breed;

    /**
     * Constructor to create a bird with a specific name and breed.
     */
    public Bird(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    /**
     * Default constructor for creating a bird without initial values.
     */
    public Bird() {
        // Initializes with default null values
    }

    /**
     * Gets the bird's name. (Getter)
     * @return the name of the bird
     */
    public String getName() {
        return name;
    }

    /**
     * Sets or changes the bird's name. (Setter)
     * @param name the new name for the bird
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the bird's breed. (Getter)
     * @return the breed of the bird
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Sets or changes the bird's breed. (Setter)
     * @param breed the new breed for the bird
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Returns a string with all the bird's data.
     * @return formatted string of the bird's details
     */
    public String getData() {
        return "Name: " + this.name + ", Breed: " + this.breed;
    }
}