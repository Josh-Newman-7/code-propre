package ex2;

/** 
 * Represents a bank account of either current account (type=CC) or savings account (type=LA).
 * @author DIGINAMIC
 */
public class CompteBancaire {
	public static final String TYPE_CURRENT = "CC";
    public static final String TYPE_SAVINGS = "LA";

    /** The balance of the account. */
    protected double solde;

    /** The overdraft limit for the account (applicable only for CC). */
    private double decouvert;

    /** The type of the account (CC for current account, LA for savings account). */
    private String type;
    
	/**
     * Creates a bank account of the specified type with the given initial balance and overdraft limit.
     *
     * @param type      The type of the account (CC for current account, LA for savings account).
     * @param solde     The initial balance of the account.
     * @param decouvert The overdraft limit for the account (applicable only for CC).
     */
    public CompteBancaire(String type, double solde, double decouvert) {
        this.type = type;
        this.solde = solde;
        this.decouvert = decouvert;
    }

    /**
     * Adds a specified amount to the account balance.
     *
     * @param montant The amount to be added.
     */
    public void ajouterMontant(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

    /**
     * Debits a specified amount from the account balance based on the account type.
     *
     * @param montant The amount to be debited.
     */
    public void debiterMontant(double montant) {
    	if (montant > 0) {
	        if (type.equals(CompteBancaire.TYPE_CURRENT) && peutDebiterCurrent(montant)) {
	            solde -= montant;
	        } else if (type.equals(CompteBancaire.TYPE_SAVINGS) && peutDebiterSavings(montant)) {
	            solde -= montant;
	        }
    	}
    }

    private boolean peutDebiterCurrent(double montant) {
        return solde - montant > decouvert;
    }

    private boolean peutDebiterSavings(double montant) {
        return solde - montant > 0;
    }
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	/** Getter for type
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/** Setter
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
