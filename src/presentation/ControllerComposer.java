package presentation;

import Persistance.JsonFileInteract;
import business.Trial;
import business.TrialManager;

import java.io.IOException;
import java.util.Objects;

public class ControllerComposer {
    private MenuComposer menuComposer;
    private static final String EXIT = "c";
    private TrialManager trialManager = new TrialManager();
    private JsonFileInteract jsonFileInteract = new JsonFileInteract();

    public ControllerComposer(MenuComposer menu) {
        this.menuComposer = menu;
    }

    public void run() throws IOException {
        menuComposer.showMessage("Entering management mode...");
        int option;
        do {
            menuComposer.showMenuComposer();
            option = menuComposer.askForInteger("Enter an option: ");
            runOption(option);
        } while (option != 3);
    }

    private void runOption(int option) throws IOException {
        switch (option) {
            case 1 -> runTrials();
            case 2 -> runEditions();
            case 3 -> menuComposer.showMessage("\nShutting down...");
            default -> menuComposer.showMessage("\nWrong action number, enter a option between 1 and 3, both included");
        }
    }

    public void runTrials() throws IOException {
        String option;
        do {
            menuComposer.showManageTrials();
            option = menuComposer.askForString("Enter an option: ");

            runOptionTrials(option);
        } while (!Objects.equals(option, EXIT));
    }

    private void runOptionTrials(String option) throws IOException {
        switch (option) {
            case "a", "A" -> runCreateTrial();
            case "b", "B" -> menuComposer.showListTrials();//listTrials();
            case "c", "C" -> menuComposer.showDeleteTrial();//deleteTrial();
            case "d", "D" -> run();
            default -> menuComposer.showMessage("\nWrong action number, enter a option between 1 and 3, both included");
        }
    }

    public void runCreateTrial() throws IOException {
        int option;
        do {
            menuComposer.showCreateTrial();
            option = menuComposer.askForInteger("Enter the trial’s type: ");
            trialManager.createTrial(option);
            jsonFileInteract.prova();
        } while (option != 4);
    }





    private void runEditions() {
        menuComposer.showManageEditions();

    }


}

