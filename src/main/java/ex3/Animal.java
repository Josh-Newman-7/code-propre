package ex3;

/**
 * Represents an animal with a name, type, and behavior.
 */
public class Animal {

    private String nom;
    private String type;
    private String comportement;

    /**
     * Creates an Animal with the specified name, type, and behavior.
     *
     * @param nom           The name of the animal.
     * @param type          The type of the animal.
     * @param comportement  The behavior of the animal.
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * Returns a string representation of the Animal.
     *
     * @return A string representation including the name, type, and behavior of the animal.
     */
    @Override
    public String toString() {
        return nom + " " + type + " " + comportement;
    }
}