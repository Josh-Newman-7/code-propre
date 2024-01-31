package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an inventory of containers (Caisse) for managing items.
 */
public class Inventaire {

    private List<Caisse> caisses;

    /**
     * Constructs an empty inventory with predefined containers (caisses).
     */
    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets"));
        caisses.add(new Caisse("Moyens objets"));
        caisses.add(new Caisse("Grands objets"));
    }

    /**
     * Adds an item to all containers in the inventory.
     *
     * @param item The item to be added.
     */
    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            caisse.ajouterItem(item);
        }
    }

    /**
     * Gets the total number of items in all containers.
     *
     * @return The total number of items in the inventory.
     */
    public int taille() {
        int total = 0;
        for (Caisse caisse : caisses) {
            total += caisse.getItems().size();
        }
        return total;
    }
}