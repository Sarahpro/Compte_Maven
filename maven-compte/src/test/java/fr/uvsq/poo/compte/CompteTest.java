package fr.uvsq.poo.compte;
import org.junit.Assert;
import org.junit.Test;

public class CompteTest {

    /**Test: Compte à découvert lors d'un debit ou virement.*/
    @Test(expected = exceptionSoldeInsuffisant.class)
    public void testDebitComptePasDecouvert() throws exceptionMontantNegatif, exceptionSoldeInsuffisant {
        Compte c = new Compte(50);
        c.debiter(60);
    }

    @Test(expected = exceptionSoldeInsuffisant.class)
    public void testVirementComptePasDecouvert() throws exceptionMontantNegatif, exceptionSoldeInsuffisant {
        Compte c = new Compte(50);
        Compte c2 = new Compte(50);
        c.virement(60, c2);
    }

    /**Tests montant nuls ou negatifs lors d'un virement, credit ou debit.*/
    @Test(expected = exceptionMontantNegatif.class)
    public void testVirementMontantNegatif() throws exceptionMontantNegatif, exceptionSoldeInsuffisant {
        Compte c = new Compte(100);
        Compte c2 = new Compte(100);
        c.virement(-10, c2);
    }

    @Test (expected = exceptionMontantNegatif.class)
    public void testVirementMontantNul() throws exceptionMontantNegatif, exceptionSoldeInsuffisant {
        Compte c = new Compte(100);
        Compte c2 = new Compte(100);
        c.virement(0, c2);
    }

    @Test(expected = exceptionMontantNegatif.class)
    public void testDebitMontantNegatif() throws exceptionMontantNegatif, exceptionSoldeInsuffisant {
        Compte c = new Compte(100);
        c.debiter(-10);
    }

    @Test(expected = exceptionMontantNegatif.class)
    public void testDebitMontantNul() throws exceptionMontantNegatif, exceptionSoldeInsuffisant {
        Compte c = new Compte(100);
        c.debiter(0);
    }

    @Test(expected = exceptionMontantNegatif.class)
    public void testCreditMontantNegatif() throws exceptionMontantNegatif {
        Compte c = new Compte(100);
        c.crediter(-10);
    }

    @Test(expected = exceptionMontantNegatif.class)
    public void testCreditMontantNul() throws exceptionMontantNegatif {
        Compte c = new Compte(100);
        c.crediter(0);
    }
}
