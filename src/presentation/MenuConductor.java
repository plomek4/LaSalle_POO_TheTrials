package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuConductor {
    private Scanner scanner;

    public MenuConductor() {
        this.scanner = new Scanner(System.in);
    }


    //4.4 Menú d’execució (Conductor)
    public void showMenuConductor(){
        spacing();
        showMessage("Entering execution mode...");
        spacing();
    }

    //Menú d'execució quan no hi ha edició per l'any actual
    public void showNoEditionAvailable(){
        showMessage("No edition is defined for the current year ().");
        spacing();
        showMessage("Shutting down...");
    }


    //Menú quan s’inicia l’execució per l’any actual
    public void showNewEdition(){
        showMessage("--- The Trials 2021 ---");
        spacing();


    }


    //Menú quan es continua l'execució per l'any actual
    public void showContinueEdition(){

    }



    public int askForInteger(String message) {while (true) { try {System.out.print(message);return scanner.nextInt();} catch (InputMismatchException e) {System.out.println("That's not a valid integer, try again!");} finally {scanner.nextLine();}}}
    public String askForString(String message) {System.out.print(message); return scanner.nextLine();}
    public void showTabulatedMessage(String message) {System.out.println("\t" + message);}
    public void showMessage(String message) { System.out.println(message); }
    public void spacing() {System.out.println();}
}
