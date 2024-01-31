package ex5;

/**
 * Represents an item with a name and weight.
 */
public class Item {

    private String nom;
    private int poids;

    /**
     * Gets the name of the item.
     *
     * @return The name of the item.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the name of the item.
     *
     * @param nom The new name of the item.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Gets the weight of the item.
     *
     * @return The weight of the item.
     */
    public int getPoids() {
        return poids;
    }

    /**
     * Sets the weight of the item.
     *
     * @param poids The new weight of the item.
     */
    public void setPoids(int poids) {
        this.poids = poids;
    }
}
