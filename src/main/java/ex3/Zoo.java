package ex3;

import java.util.List;
import java.util.ArrayList;


/**
 * Represents a Zoo with a collection of animals.
 */
public class Zoo {

    private String nom;
    private List<Animal> animaux;

    /**
     * Creates a Zoo with a specified name.
     *
     * @param nom The name of the Zoo.
     */
    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    /**
     * Adds an animal to the Zoo.
     *
     * @param nomAnimal     The name of the animal.
     * @param typeAnimal    The type of the animal.
     * @param comportement   The behavior of the animal.
     */
    public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
        Animal animal = new Animal(nomAnimal, typeAnimal, comportement);
        animaux.add(animal);
    }

    /**
     * Displays the list of animals in the Zoo.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal);
        }
    }

    /**
     * Gets the number of animals in the Zoo.
     *
     * @return The number of animals in the Zoo.
     */
    public int taille() {
        return animaux.size();
    }

    /**
     * Gets the name of the Zoo.
     *
     * @return The name of the Zoo.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the name of the Zoo.
     *
     * @param nom The new name of the Zoo.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
