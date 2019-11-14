package fr.uvsq.poo.compte;

public class Compte {
    private int solde;

    /**   Contructeur    */
    public Compte(final int montant) {
        this.solde = montant;
    }

    /** Méthode: Consultation du solde de compte*/
    public void consultSolde() {
        System.out.println("Vous avez "+ this.solde +" euros sur votre compte");
    }

    /** Méthode: Retourne le solde de compte*/
    public int getSolde() {
        return this.solde;
    }

    /** Méthode: crédite le compte*/
    public void crediter(final int montant) throws exceptionMontantNegatif {
        if (montant > 0) {
            this.solde += montant;
        }
        else { throw new exceptionMontantNegatif(); }
    }

    /** Méthode: Débite le compte*/
    public void debiter(final int montant) throws exceptionMontantNegatif, exceptionSoldeInsuffisant {
        int soldeavantdebit = this.solde;
    	if (montant > 0 && this.solde - montant >= 0) {
    		this.solde = solde - montant;
    	}
    	if (montant < 1) { throw new exceptionMontantNegatif(); }
    	else if (soldeavantdebit - montant < 0) { throw new exceptionSoldeInsuffisant(); }
    }

    /** Méthode: Effectue un virement du compte vers un autre*/
    public boolean virement(final int montant, final Compte destinataire) throws exceptionMontantNegatif, exceptionSoldeInsuffisant {
        this.debiter(montant);
    	destinataire.crediter(montant);
    	return true;
    }
}
