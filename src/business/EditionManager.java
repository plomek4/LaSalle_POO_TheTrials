package business;

public class EditionManager {
    private Edition edition;

    public void addTrial(Trial trial){
        edition.getTrialList().add(trial);
    }

}
