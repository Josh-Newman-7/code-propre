package ex1;

import java.util.Date;

/**
 * The Entreprise class represents a business entity.
 */
public class Entreprise {

    /** The SIRET number of the enterprise. */
    public int siret;

    /** The name of the enterprise. */
    public String nom;

    /** The address of the enterprise. */
    public String adresse;

    /** The date of creation of the enterprise. */
    public Date dateCreation;

    /** The maximum capital allowed for any enterprise. */
    public static final int CAPITAL_MAX = 3000000;

    /**
     * Displays the status of the enterprise.
     */
    public void displayStatus() {
        // Implementation to display the status goes here
    }
}
