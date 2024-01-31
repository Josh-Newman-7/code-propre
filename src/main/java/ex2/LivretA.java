package ex2;

/**
 * Represents a savings account of type Livret A, which is a subclass of CompteBancaire.
 */
public class LivretA extends CompteBancaire {
	public static final String TYPE_LIVRET_A = "LA";

    /** The annual interest rate for the savings account (applicable only for LA). */
    private double tauxRemuneration;
	
    /**
     * Creates a Livret A savings account with the specified initial balance and annual interest rate.
     *
     * @param type             The type of the account (LA for Livret A).
     * @param solde            The initial balance of the account.
     * @param tauxRemuneration The annual interest rate for the savings account.
     */
    public LivretA(String type, double solde, double tauxRemuneration) {
        // Calls the constructor of the superclass (CompteBancaire) with 0 for decouvert
        super(type, solde, 0);
        this.tauxRemuneration = tauxRemuneration;
    }
    
    /**
     * Applies the annual interest rate to the savings account balance.
     */
    public void appliquerRemuAnnuelle() {
    	setSolde(getSolde() + getSolde() * tauxRemuneration / 100);
    }
    
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		if (tauxRemuneration >= 0) {
	        this.tauxRemuneration = tauxRemuneration;
	    }
	}
}