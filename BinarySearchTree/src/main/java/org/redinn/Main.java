package org.redinn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Progetto per l'implementazione di un albero binario di ricerca.
        // Di seguito il processo di inserimento degli elementi passo-passo.

        Scanner input = new Scanner(System.in);

        System.out.println(ColorText.GREEN + "Benvenuto nel fantastico progetto sugli Alberi Binari di Ricerca!!" + ColorText.RESET);
        System.out.print("Creiamo innanzitutto l'albero..");

        // Piccola semplice "animazione" per la creazione dell'albero
        for(int i=0; i<5; i++){
            Thread.sleep(500);
            System.out.print(".");
        }
        System.out.println("Albero binario di ricerca creato!");

        // ######### INSERIMENTO DATI NELL'ALBERO BINARIO DI RICERCA #########
        BinarySearchTree BST = new BinarySearchTree();
        System.out.println(ColorText.YELLOW + "Aggiungiamo adesso i seguenti numeri in ordine:" + ColorText.CYAN + " 23, 45, 12, 57, 42, 15, 87" + ColorText.RESET);
        System.out.print("Premere INVIO per inserire i numeri...");
        input.nextLine();

        BST.aggiungiNodo(23);
        BST.aggiungiNodo(45);
        BST.aggiungiNodo(12);
        BST.aggiungiNodo(57);
        BST.aggiungiNodo(42);
        BST.aggiungiNodo(15);
        BST.aggiungiNodo(87);

        // ######### VISTA ANTICIPATA DEL BST #########
        System.out.println("\nNumeri correttamente inseriti!");
        System.out.print("Premi invio per visualizzare la vista anticipata dell'albero appena creato!");
        input.nextLine();
        System.out.println();

        System.out.println(ColorText.YELLOW + "Ecco la vista anticipata: " + ColorText.CYAN);
        BST.visitaAnticipata(BST.getPtr());

        // ######### VISTA SIMMETRICA DEL BST #########
        System.out.print(ColorText.RESET + "\nPremi invio per visualizzare invece la vista simmetrica!");
        input.nextLine();
        System.out.println();

        System.out.println(ColorText.YELLOW + "Ecco la vista simmetrica: " + ColorText.CYAN);
        BST.visitaSimmetrica(BST.getPtr());

        // ######### VISTA DIFFERITA DEL BST #########
        System.out.println(ColorText.RESET + "\nPremi invio per visualizzare infine la vista differita!");
        input.nextLine();

        System.out.println(ColorText.YELLOW + "Ecco la vista differita: " + ColorText.CYAN);
        BST.visitaDifferita(BST.getPtr());

        // ######### RICERCA NODO #########
        System.out.print(ColorText.RESET + "\nInserisci adesso un numero da cercare nell'albero: ");
        if(BST.ricercaNodo(BST.getPtr(), input.nextInt())){
            System.out.println(ColorText.GREEN + "Il numero inserito esiste nell'albero!" + ColorText.RESET);
        }
        else{
            System.out.println(ColorText.RED + "Il numero inserito non e' stato trovato nell'albero!" + ColorText.RESET);
        }

        // Termine programma

        String endProgram = "FINE >:-( ";
        for(int i=0; i<endProgram.length(); i++){
            Thread.sleep(200);
            System.out.print(ColorText.GREEN + endProgram.chars().mapToObj(ch -> (char)ch).toArray(Character[] ::new)[i]);
        }

    }
}
