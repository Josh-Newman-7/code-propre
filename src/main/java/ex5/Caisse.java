package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;
    private List<Item> items;

    public Caisse(String nom) {
        this.nom = nom;
        this.items = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    // Nouvelle méthode pour ajouter un item à la caisse en fonction de son poids
    public void ajouterItem(Item item) {
        if (item.getPoids() < 5) {
            items.add(item);
        } else if (item.getPoids() >= 5 && item.getPoids() <= 20) {
            items.add(item);
        } else if (item.getPoids() >= 20) {
            items.add(item);
        }
    }
}
