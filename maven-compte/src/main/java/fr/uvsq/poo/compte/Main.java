package fr.uvsq.poo.compte;

public class Main {
    public static void main(String[] args) throws exceptionMontantNegatif, exceptionSoldeInsuffisant {
        Compte c = new Compte(50);
        Compte c1 = new Compte(50);
        System.out.println("Compte initial 1:" + c.getSolde() );
        System.out.println("Compte initial 2:" + c1.getSolde() );
        c.crediter(10);
        System.out.println("Crédit de 10 sur compte 1");
        System.out.println("Virement de 50 de compte 1 sur compte 2");
        c.virement(50, c1);
        System.out.println("Compte 1 après transaction:" + c.getSolde() );
        System.out.println("Compte 2 après transaction:" + c1.getSolde() );
    }
}
