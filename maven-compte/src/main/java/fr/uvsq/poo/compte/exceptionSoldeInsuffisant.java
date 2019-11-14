package fr.uvsq.poo.compte;

public class exceptionSoldeInsuffisant extends Exception {
    exceptionSoldeInsuffisant () {
        System.out.println("Le solde de votre compte est insuffisant!");
    }
}
