package business;

import Persistance.JsonFileInteract;
import presentation.MenuMain;


public class TrialManager {
    private JsonFileInteract jsonFileInteract;
    private PaperPublication paperPublication = new PaperPublication();
    private DoctoralThesisDefense doctoralThesisDefense;
    private BudgetRequest budgetRequest;
    private MasterStudies masterStudies;
    private Trial trial;
    private MenuMain menu = new MenuMain();


    public void createTrial(int option){
        switch (option) {
            case 1 -> enterPaperPublicationData();
           /* case 2 -> enterMasterStudiesData();
            case 3 -> enterDoctoralThesisDefenseData();
            case 4 -> enterBudgetRequestData(); */
            default -> menu.showMessage("\nWrong action number, enter a option between 1 and 3, both included");
        }
    }


    public PaperPublication enterPaperPublicationData(){
        PaperPublication paperPublicationAUX = new PaperPublication();

        paperPublicationAUX.setName(menu.askForString("Enter the trial’s name"));
        paperPublication.setJournalName(menu.askForString("Enter the journal’s name: "));
        paperPublication.setJournalQuartile(menu.askForString("Enter the journal’s quartile: "));
        paperPublication.setAcceptanceProbability(menu.askForInteger("Enter the acceptance probability: 2"));
        paperPublication.setRevisionProbability(menu.askForInteger("Enter the revision probability:"));
        paperPublication.setRejectionProbability(menu.askForInteger("Enter the rejection probability: "));

        return paperPublication;

    }






}
