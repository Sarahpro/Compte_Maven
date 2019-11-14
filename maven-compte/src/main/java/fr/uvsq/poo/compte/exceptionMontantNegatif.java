package fr.uvsq.poo.compte;

public class exceptionMontantNegatif extends Exception {
    exceptionMontantNegatif() {
            System.out.println("Montant nul ou négatif non autorisé!");
        }
}
